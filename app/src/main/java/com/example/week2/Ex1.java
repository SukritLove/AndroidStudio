package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Ex1 extends AppCompatActivity {
    //Step 1
    Button _book, _pen, _eraser;
    ImageView _imgShow;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);
        //Step 2
        _book = findViewById(R.id.Book);
        _pen = findViewById(R.id.Pen);
        _eraser = findViewById(R.id.Eraser);
        _imgShow = findViewById(R.id.image);

        //Step 3
        _book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _imgShow.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.ibook));
            }
        });
        _pen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _imgShow.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.ipen));
            }
        });

        _eraser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _imgShow.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.ieraser));
            }
        });
        }
    }
