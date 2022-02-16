package com.example.laundrytimerfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class TimerCnt extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.timer_cnt);

        textView = findViewById(R.id.countdown_text);

        Thread thread = new Thread() {

            @Override

            public void run() {

                while (!isInterrupted()) {

                    runOnUiThread(new Runnable() {

                        @Override

                        public void run() {

                            Calendar calendar = Calendar.getInstance(); // 칼렌다 변수



                            int minute = calendar.get(Calendar.MINUTE); // 분

                            int second = calendar.get(Calendar.SECOND); // 초

                            minute = (minute+30)%60;

                            textView.setText(minute + ":" + second);

                        }

                    });

                    try {

                        Thread.sleep(1000); // 1000 ms = 1초

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }

                } // while

            } // run()

        }; // new Thread() { };



        thread.start();

        ImageButton btnX = (ImageButton) findViewById(R.id.buttonX);

        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),LaundryTimer.class);
                startActivity(intent);
            }
        });

    }
}
