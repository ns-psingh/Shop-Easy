package com.example.premal2.shopeasyily;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CustomerStack extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_stack);
        TextView rfid= (TextView) findViewById(R.id.rfidstatus);
        final TextView t1=(TextView) findViewById(R.id.t1);
        final TextView t2=(TextView) findViewById(R.id.t2);
        final TextView t3=(TextView) findViewById(R.id.t3);
        final TextView t4=(TextView) findViewById(R.id.t4);
        final TextView t5=(TextView) findViewById(R.id.t5);
        final TextView t6=(TextView) findViewById(R.id.t6);
        rfid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("RFID:"+"4151");
                t2.setText("Product ID:"+"PR25OE");
                t3.setText("Mfg. Date"+"11/11/2016");
                t4.setText("Expiry date"+"08/03/2018");
                t5.setText("Price:"+"Rs.400");
                t6.setText("Quantity"+"1");
            }
        });
    }
}
