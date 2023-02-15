package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class CheckGradeResult extends AppCompatActivity {
	TextView GradeShow;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_check_grade_result);

		GradeShow = findViewById(R.id.Gresult);

		final SharedPreferences sp = this.getSharedPreferences("share_user", Context.MODE_PRIVATE);
		final SharedPreferences.Editor editor = sp.edit();

		GradeShow.setText("Subject : " + sp.getString("Subject", "Invalid") +
				"\nGrade : " + gradeCheck(sp.getInt("Score",0)));

	}

	public String gradeCheck(int score){
			 if (score >= 80)   {return "A";}
		else if (score >= 75)   {return "B+";}
		else if (score >= 70)   {return "B";}
		else if (score >= 65)   {return "C+";}
		else if (score >= 60)   {return "C";}
		else if (score >= 55)   {return "D+";}
		else if (score >= 50)   {return "D";}
		return "F";
	}
}