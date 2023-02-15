package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CheckGrade extends AppCompatActivity {
	EditText _subj, _score;
	Button _save, _resultPage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_check_grade);

		_subj = findViewById(R.id.subj);
		_score = findViewById(R.id.score);
		_save = findViewById(R.id.save);
		_resultPage = findViewById(R.id.resultPage);


		final SharedPreferences sp = this.getSharedPreferences("share_user", Context.MODE_PRIVATE);
		final SharedPreferences.Editor editor = sp.edit();

		_save.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String sub = _subj.getText().toString();
				int sc = Integer.parseInt(_score.getText().toString());

				editor.putString("Subject",sub);
				editor.putInt("Score",sc);
				editor.commit();
				Toast.makeText(getApplicationContext(),"Saved" , Toast.LENGTH_LONG).show();

			}
		});

		_resultPage.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(getApplicationContext(),CheckGradeResult.class);
				startActivity(intent);
			}
		});



	}
}