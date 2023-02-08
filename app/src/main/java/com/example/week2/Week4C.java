package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Week4C extends AppCompatActivity {
	TextView resultP;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_week4_c);
		resultP = findViewById(R.id.Plus_re);

		Intent intent = getIntent();
		String _num1 = intent.getStringExtra("num1"),
				_num2 = intent.getStringExtra("num2");
		int result = Integer.parseInt(_num1) + Integer.parseInt(_num2);

		resultP.setText(_num1  +"+" +_num2 + "=" + (result));
	}
}