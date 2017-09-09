package com.example.premal2.shopeasyily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CustomerStack extends AppCompatActivity {

    private int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_stack);
        final String[] rfd=new String[]{"1524","1542","3425","4463","4177"};
        final String[] productid=new String[]{"FE24YR","PR25OE","RJ42I9","HU53II","OH09GG"};
        final String[] mfg=new String[]{"11/09/2016","12/02/2017","13/06/2017","04/11/2016","02/08/2017"};
        final String[] exp=new String[]{"11/08/2018","15/11/2018","23/05/2018","20/04/2018","20/02/2018"};
        final String[] price=new String[]{"100","35","20","45","100"};
        TextView rfid= (TextView) findViewById(R.id.rfidstatus);
        final TextView t1=(TextView) findViewById(R.id.t1);
        final TextView t2=(TextView) findViewById(R.id.t2);
        final TextView t3=(TextView) findViewById(R.id.t3);
        final TextView t4=(TextView) findViewById(R.id.t4);
        final TextView t5=(TextView) findViewById(R.id.t5);

        Button addc= (Button) findViewById(R.id.add);
        Button viewc=(Button) findViewById(R.id.viewc);
        i=0;
        addc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Added to cart",
                        Toast.LENGTH_SHORT).show();
            }
        });
        viewc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==5)
                {Intent x= new Intent(CustomerStack.this, ListActivity.class);
                startActivity(x);}
            }
        });
        rfid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("RFID:"+rfd[i]);
                t2.setText("Product ID:"+productid[i]);
                t3.setText("Mfg. Date"+mfg[i]);
                t4.setText("Expiry date"+exp[i]);
                t5.setText("Price:"+price[i]);
                if(i<5)
                    i=i+1;
            }
        });
    }
}
