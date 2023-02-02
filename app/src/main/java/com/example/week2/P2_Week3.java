package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class P2_Week3 extends AppCompatActivity {

	Button p2, map, img;





	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_p2_week3);
		 p2 = findViewById(R.id.goP2);
		 map = findViewById(R.id.vM);
		 img = findViewById(R.id.imgAd);



		 //call Page 2
		p2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent myinnt = new Intent(getApplicationContext(),P3_Week3.class);
				startActivity(myinnt);
			}
		});
		//call Map
		map.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String goCode = "geo:0,0?q=Seacon Srinakarin";
				Intent Gmap = new Intent(Intent.ACTION_VIEW, Uri.parse(goCode));
				startActivity(Gmap);
			}
		});
		//Call IMG
		img.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String goCode = "http://maps.google.com/maps?saddr=13.747170,100.535192&daddr=13.800416,100.551019";
				Intent Gmap = new Intent(Intent.ACTION_VIEW, Uri.parse(goCode));
				startActivity(Gmap);
			}
		});





	}
}