package com.example.premal2.shopeasyily;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button regbtn= (Button) findViewById(R.id.button5);
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signup= new Intent(MainActivity.this, register.class);
                startActivity(signup);
            }
        });
        Button login =(Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText e=(EditText) findViewById(R.id.mobileno);
                String m= e.getText().toString();
                if(m.length()==0)
                {Toast.makeText(getApplicationContext(), "Please enter the mobile number!"+m,
                        Toast.LENGTH_SHORT).show();}
                else
                {Intent o=new Intent(MainActivity.this,OTP.class);
                startActivity(o);}
            }
        });

    }
    private int otppass()
    {
        Random rand=new Random();
        int n=rand.nextInt(8999)+1000;
        NotificationCompat.Builder builder= (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.abc)
                .setContentTitle("ShopEasily")
                .setContentText("Your OTP is "+n);
        builder.setDefaults(Notification.DEFAULT_SOUND);
        Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);

        // Add as notification
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
        return n;
    }
    @Override
    public void onBackPressed() {
// super.onBackPressed(); commented this line in order to disable back press
//Write your code here
    }
}
