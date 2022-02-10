package com.example.board;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Board extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.board);

        ImageButton writeButton = (ImageButton) findViewById(R.id.writeButton);

        writeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
            Intent intent = new Intent(getApplicationContext(), Write.class);
            startActivity(intent);
            }
        });
    }
}