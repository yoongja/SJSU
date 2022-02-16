package com.example.laundrytimerfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LaundryTimer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.laundry_timer);

        ImageButton laundry1 = (ImageButton) findViewById(R.id.laundryNo1Img);
        ImageButton dryer1 = (ImageButton) findViewById(R.id.dryerNo1Img);

        laundry1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),TimerCnt.class);
                startActivity(intent);
            }
        });

        dryer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Repair.class);
                startActivity(intent);
            }
        });

    }
}