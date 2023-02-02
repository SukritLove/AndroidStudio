package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Week3 extends AppCompatActivity {

    EditText txt;
    Spinner food, drinks;
    Button send;
    TextView show;
    CheckBox male, female;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week3);

        txt= findViewById(R.id._txt);
        food = findViewById(R.id._food);
        drinks = findViewById(R.id._drinks);
        send = findViewById(R.id._send);
        show = findViewById(R.id._txtShow);
        male = findViewById(R.id.checkMale);
        female = findViewById(R.id.checkFemale);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!txt.getText().toString().isEmpty() && !txt.getText().toString().isEmpty() ){

                    //String Gender = ((CheckBox)view).getText().toString();
                    Boolean gender = ((CheckBox)view).isChecked();

                    //Toast.makeText(getApplicationContext(),Gender +" is " + male , Toast.LENGTH_LONG).show();

                    String Meal = food.getSelectedItem().toString(),
                            Baverages = drinks.getSelectedItem().toString(),
                            MSG = (gender ? "Mr." : "") + txt.getText().toString() + " Your order are " + Meal + " & " + Baverages;

                    show.setText(MSG);
                }
            }
        });
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!txt.getText().toString().isEmpty() && !txt.getText().toString().isEmpty() ){

                    //String Gender = ((CheckBox)view).getText().toString();
                    Boolean gender = ((CheckBox)view).isChecked();

                    //Toast.makeText(getApplicationContext(),Gender +" is " + male , Toast.LENGTH_LONG).show();

                    String Meal = food.getSelectedItem().toString(),
                            Baverages = drinks.getSelectedItem().toString(),
                            MSG = (gender ? "Miss" : "") + txt.getText().toString() + " Your order are " + Meal + " & " + Baverages;

                    show.setText(MSG);
                }
            }
        });
        send.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if(!txt.getText().toString().isEmpty() && !txt.getText().toString().isEmpty() ){
                    String Meal = food.getSelectedItem().toString(),
                            Baverages = drinks.getSelectedItem().toString(),
                            MSG = "Hey " + txt.getText().toString() + " Your order are " + Meal + " & " + Baverages;

                    show.setText(MSG);
                }
            }
        });
    }
}