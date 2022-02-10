package com.example.luandrytimer;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Timer_2 extends AppCompatActivity {

    private TextView countDownText; //타이머 현황
    private Button startButton;
    private EditText minText;
    private EditText secText;

    private long time = 0;
    private long tempTime=0;
    private boolean firstState;//처음상태
    private CountDownTimer countDownTimer;


    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer);

        ImageButton btnX = (ImageButton) findViewById(R.id.buttonX);
        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        countDownText = findViewById(R.id.countdown_text);
        startButton = (Button) findViewById(R.id.startButton);
        minText = findViewById(R.id.minEdit);
        secText = findViewById(R.id.secEdit);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstState = true;
                startTimer();
            }
        });

        //타이머구현
        private void startTimer(){
            if(firstState){
                String sMin = minText.getText().toString();
                String sSec = secText.getText().toString();
                time = (Long.parseLong(sMin)*60000)+(Long.parseLong(sSec)*1000)+1000;
            }else{
                time = tempTime;
            }

            countDownTimer = new CountDownTimer(time,1000) {
                @Override
                public void onTick(long l) {
                    tempTime = l;
                    updateTimer();
                }

                @Override
                public void onFinish() { }
            }.start();
            firstState = false;
        }

        private void updateTimer(){
            int minutes = (int)tempTime%3600000/60000;
            int seconds = (int)tempTime%360000%60000/1000;

            String timeLeftText="";

            if(minutes<10)timeLeftText+="0";
            timeLeftText+=minutes;

            if(seconds<10)timeLeftText+="0";
            timeLeftText += seconds;

            countDownText.setText(timeLeftText);
        }

    }
}
