package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Week5 extends AppCompatActivity {
    Button _login;
    EditText _user,_pass,_age;
    TextView _re5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week5);
        _login = findViewById(R.id.loGin);
        _user = findViewById(R.id.userN);
        _pass = findViewById(R.id.pass);
        _re5 = findViewById(R.id.Result5);
        _age = findViewById(R.id.age);

        final SharedPreferences sp = this.getSharedPreferences("share_user", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sp.edit();



        _login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = _user.getText().toString(),
                       passW = _pass.getText().toString();

                int Age = Integer.parseInt(_age.getText().toString());

                editor.putString("user_name",user);
                editor.putString("pass_word",passW);
                editor.putInt("age", Age);
                editor.commit();

                Intent intent = new Intent(getApplicationContext(),Week5A.class);
                startActivity(intent);
            }
        });

        _re5.setText("Mr." + sp.getString("user_name","Not Found") +
                " " + sp.getString("pass_word", "Not Found") +
                " " + sp.getInt("age",0));
    }
}