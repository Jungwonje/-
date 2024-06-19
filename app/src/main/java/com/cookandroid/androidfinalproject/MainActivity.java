package com.cookandroid.androidfinalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("유로 2024");

        final RadioButton rdoSecond = findViewById(R.id.rdoSecond);
        final RadioButton rdoThird = findViewById(R.id.rdoThird);

        Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);
        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent;

                if (rdoSecond.isChecked()) {
                    intent = new Intent(getApplicationContext(), SecondActivity.class);
                } else if (rdoThird.isChecked()) {
                    intent = new Intent(getApplicationContext(), ThirdActivity.class);
                } else {
                    intent = new Intent(getApplicationContext(), FourthActivity.class);
                }

                startActivity(intent);
            }
        });
    }
}