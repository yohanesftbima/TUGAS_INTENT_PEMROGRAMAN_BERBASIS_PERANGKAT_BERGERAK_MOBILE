package com.example.intent1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonCallIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCallIntent = (Button) findViewById(R.id.buttonCallIntent);
        buttonCallIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openact2();

            }
        });
    }
    public void openact2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}