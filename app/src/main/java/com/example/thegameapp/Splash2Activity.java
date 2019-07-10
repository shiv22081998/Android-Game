package com.example.thegameapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        Thread thread=new Thread()
        {
            @Override
            public void run() {
               try{sleep(5000);}
               catch (Exception e)
               {e.printStackTrace();}
               finally {
                   Intent mainintent=new Intent(Splash2Activity.this,MainActivity.class);
                    startActivity(mainintent);
               }
            }
        };
          thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
