package com.example.luandrytimer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;
import android.os.CountDownTimer;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Timer extends AppCompatActivity {

    static int hidden = 1;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer);

        Button btnStart = (Button) findViewById(R.id.startButton);

        ImageButton btnX = (ImageButton) findViewById(R.id.buttonX);

        TextView visibleLaundry = (TextView) findViewById(R.id.laundryNo1);

        TextView invisibleLaundry = (TextView) findViewById(R.id.unLaundryNo1);

        if(hidden==0){
            visibleLaundry.setVisibility(View.INVISIBLE);
            invisibleLaundry.setVisibility(View.VISIBLE);
        }
        else{
            visibleLaundry.setVisibility(View.VISIBLE);
            invisibleLaundry.setVisibility(View.INVISIBLE);
        }

        btnStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                hidden = 1-hidden;
                if(hidden==0){
                    visibleLaundry.setVisibility(View.INVISIBLE);
                    invisibleLaundry.setVisibility(View.VISIBLE);
                }
                else{
                    visibleLaundry.setVisibility(View.VISIBLE);
                    invisibleLaundry.setVisibility(View.INVISIBLE);
                }
            }
        });


        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
