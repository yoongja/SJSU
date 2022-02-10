package com.example.board;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Write extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.write);

        ImageButton postButton = (ImageButton) findViewById(R.id.postButton);
        ImageView bottomText = (ImageView) findViewById(R.id.bottomText);

        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(getApplicationContext(), BottomVisible.class);
                startActivity(intent);
            }
        });

    }
}