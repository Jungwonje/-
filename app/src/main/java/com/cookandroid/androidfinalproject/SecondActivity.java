package com.cookandroid.androidfinalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("유로2024 경기장");

        final String[] Stadium = { "올림피아슈타디온 베를린[베를린,71000석]", "뮌헨 풋볼 아레나[뮌헨,66000석]", "BVB 슈타디온 도르트문트[도르트문트,62000석]", "슈투트가르트 아레나[슈투트가르트,51000석]", "아레나 아우프샬케[겔젠키르헨,50000석]", "폴크스파르크슈타디온 함부르크[함부르크,49000석]",
                "프랑크푸르트 아레나[프랑크푸르트,47000석]", "뒤셀도르프 아레나[뒤셀도르프,47000석]", "쾰른 스타디움[쾰른,43000석]", "라이프치히 스타디움[라이프치히,40000석]" };

        final Integer[] posterID = { R.drawable.stadium1, R.drawable.stadium2,
                R.drawable.stadium3, R.drawable.stadium4, R.drawable.stadium5,
                R.drawable.stadium6, R.drawable.stadium7, R.drawable.stadium8,
                R.drawable.stadium9, R.drawable.stadium10 };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, Stadium);

        Spinner spinner = findViewById(R.id.spinner1);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View view,
                                       int position, long id) {
                ImageView ivPoster = findViewById(R.id.ivStadium);
                ivPoster.setScaleType(ImageView.ScaleType.FIT_CENTER);
                ivPoster.setPadding(5, 5, 5, 5);
                ivPoster.setImageResource(posterID[position]);
            }
            public void onNothingSelected(AdapterView<?> arg0) { }
        });

        Button btnReturn = findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
}

