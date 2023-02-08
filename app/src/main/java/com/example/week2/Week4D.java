package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Week4D extends AppCompatActivity {

	TextView txt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_week4_d);

		txt= findViewById(R.id.n_re);

		Intent intent = getIntent();
		txt.setText(intent.getStringExtra("_fName") + " " + intent.getStringExtra("_lName"));

		overridePendingTransition(R.anim.open,R.anim.out);
	}
}