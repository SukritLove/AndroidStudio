package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Week4B extends AppCompatActivity {

	TextView _re;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_week4_b);
		_re = findViewById(R.id.FL_n);

		Intent intent = getIntent();
		String first = intent.getStringExtra("_fName"),
			   last = intent.getStringExtra("_lName");

		_re.setText("Result : \n" + first + " " + last);
	}
}