package com.myexample.fortuneappnisshii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button fortune_button = findViewById(R.id.fortune_button);
        fortune_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String unsei = "";
                Random random = new Random();
                switch (random.nextInt(6)){
                    case 0:
                        unsei = "大吉";
                        break;
                    case 1:
                        unsei = "吉";
                        break;
                    case 2:
                        unsei = "中吉";
                        break;
                    case 3:
                        unsei = "末吉";
                        break;
                    case 4:
                        unsei = "凶";
                        break;
                    case 5:
                        unsei = "大凶";
                        break;
                }
                Toast.makeText(MainActivity.this, unsei, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
