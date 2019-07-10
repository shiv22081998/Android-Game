package com.example.thegameapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameOver2Activity extends AppCompatActivity {

    private Button startgameagain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over2);

        startgameagain=(Button)findViewById(R.id.play_again);
        startgameagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainintent=new Intent(GameOver2Activity.this,MainActivity.class);
                startActivity(mainintent);
            }
        });
    }
}
