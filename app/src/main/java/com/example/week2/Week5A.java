package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Week5A extends AppCompatActivity {
	TextView _re;
	Button nextPage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_week2);

		_re = findViewById(R.id.result5A);
		nextPage = findViewById(R.id._nextP);

		final SharedPreferences sp = this.getSharedPreferences("share_user", Context.MODE_PRIVATE);
		final SharedPreferences.Editor editor = sp.edit();

		_re.setText("Mr." + sp.getString("user_name","Not Found") +
				" " + sp.getString("pass_word", "Not Found") +
				" " + sp.getInt("age",0));

		nextPage.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(getApplicationContext(),Week5B.class);
				startActivity(intent);
			}
		});
	}
}