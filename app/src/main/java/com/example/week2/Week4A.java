package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Week4A extends AppCompatActivity {
	EditText first_n, last_n;
	Button next_P, new_u, showMe;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_week4);
		first_n = findViewById(R.id.F_name);
		last_n = findViewById(R.id.L_name);
		next_P = findViewById(R.id.login);
		new_u = findViewById(R.id.N_user);
		showMe = findViewById(R.id.show_me);

		next_P.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String _fName = first_n.getText().toString(),
					   _lName = last_n.getText().toString();

				Intent intent = new Intent(getApplicationContext(),Week4B.class);
				intent.putExtra("_fName",_fName);
				intent.putExtra("_lName",_lName);
				startActivity(intent);

				overridePendingTransition(R.anim.open,R.anim.out);
			}
		});
		new_u.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String _fName = first_n.getText().toString(),
						_lName = last_n.getText().toString();
				Intent intent = new Intent(getApplicationContext(),Week4C.class);
				intent.putExtra("num1",_fName);
				intent.putExtra("num2",_lName);
				startActivity(intent);

				overridePendingTransition(R.anim.open,R.anim.out);
			}
		});

		showMe.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String _fName = first_n.getText().toString(),
						_lName = last_n.getText().toString();

				Intent intent = new Intent(getApplicationContext(),Week4D.class);
				intent.putExtra("_fName",_fName);
				intent.putExtra("_lName",_lName);
				startActivity(intent);

				overridePendingTransition(R.anim.open,R.anim.out);
			}
		});

	}
}