package com.example.premal2.shopeasyily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import java.util.concurrent.TimeUnit;
import android.widget.Toast;


public class Home extends AppCompatActivity {

    public ProgressBar spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        spinner = (ProgressBar)findViewById(R.id.progressBar1);
        spinner.setVisibility(View.INVISIBLE);
        Button search=(Button) findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(Home.this, Nearby.class);
                startActivity(o);
            }
        });
        Button logtm=(Button) findViewById(R.id.logtomn);
        logtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                spinner.setVisibility(View.VISIBLE);
                Intent o=new Intent(Home.this, MainActivity.class);
                startActivity(o);
            }
        });

    }
    @Override
    public void onBackPressed() {
// super.onBackPressed(); commented this line in order to disable back press
//Write your code here
    }
}
