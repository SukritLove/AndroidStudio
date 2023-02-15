package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Week5B extends AppCompatActivity {
	TextView _re5B;
	Button goHome;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_week5_b);
		_re5B = findViewById(R.id.result5B);
		goHome = findViewById(R.id.Bhome);

		final SharedPreferences sp = this.getSharedPreferences("share_user", Context.MODE_PRIVATE);
		final SharedPreferences.Editor editor = sp.edit();

		_re5B.setText("Mr." + sp.getString("user_name","Not Found") +
				" " + sp.getString("pass_word", "Not Found") +
				" " + sp.getInt("age",0));

		goHome.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(getApplicationContext(),Week5.class);
				startActivity(intent);
			}
		});

	}
}