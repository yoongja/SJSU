package com.example.luandrytimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton laundryNo1Img = (ImageButton) findViewById(R.id.laundryNo1Img);
        ImageButton laundryNo2Img = (ImageButton) findViewById(R.id.laundryNo2Img);
        ImageButton laundryNo3Img = (ImageButton) findViewById(R.id.laundryNo3Img);
        ImageButton laundryNo4Img = (ImageButton) findViewById(R.id.laundryNo4Img);

        laundryNo1Img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Timer.class);
                    startActivity(intent);
            }
        });

        laundryNo2Img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Timer.class);
                startActivity(intent);
            }
        });

        laundryNo3Img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Timer.class);
                startActivity(intent);
            }
        });

        laundryNo4Img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Timer.class);
                startActivity(intent);
            }
        });

        ImageButton dryerNo1Img = (ImageButton) findViewById(R.id.dryerNo1Img);
        ImageButton dryerNo2Img = (ImageButton) findViewById(R.id.dryerNo2Img);
        ImageButton dryerNo3Img = (ImageButton) findViewById(R.id.dryerNo3Img);
        ImageButton dryerNo4Img = (ImageButton) findViewById(R.id.dryerNo4Img);

        dryerNo1Img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Timer.class);
                startActivity(intent);
            }
        });

        dryerNo2Img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Timer.class);
                startActivity(intent);
            }
        });

        dryerNo3Img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Timer.class);
                startActivity(intent);
            }
        });

        dryerNo4Img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Timer.class);
                startActivity(intent);
            }
        });

    }

}