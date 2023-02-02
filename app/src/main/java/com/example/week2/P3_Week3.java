package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class P3_Week3 extends AppCompatActivity {
	Button p3, p1, home;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_p3_week3);

		p3 = findViewById(R.id.goP3);
		p1 = findViewById(R.id.goP1);
		home = findViewById(R.id.goMyhome);

		//call Page 2
		p3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent myinnt = new Intent(getApplicationContext(), P4_Week3.class);
				startActivity(myinnt);
			}
		});
		//call Map
		p1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent myinnt = new Intent(getApplicationContext(), P2_Week3.class);
				startActivity(myinnt);
			}
		});
		//Call IMG
		home.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String goCode = "http://maps.google.com/maps?saddr=13.904291, 100.345838&daddr=13.738131253161491, 100.62838909663316";
				Intent Gmap = new Intent(Intent.ACTION_VIEW, Uri.parse(goCode));
				startActivity(Gmap);
			}
		});
	}
}
