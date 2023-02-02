package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class P4_Week3 extends AppCompatActivity {
	Button go_1,go_2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_p4_week3);

		go_1= findViewById(R.id.goP6);
		go_2=findViewById(R.id.goP5);

		go_1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent myinnt = new Intent(getApplicationContext(), P2_Week3.class);
				startActivity(myinnt);
			}
		});
		//call Map
		go_2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent myinnt = new Intent(getApplicationContext(), P3_Week3.class);
				startActivity(myinnt);
			}
		});

	}
}