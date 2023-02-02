package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Calculator extends AppCompatActivity {

    EditText _num1, _num2;
    Button _plus, _minus, _multi, _devide;
    TextView _result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        _num1 = findViewById(R.id.num1);
        _num2 = findViewById(R.id.num2);
        _plus = findViewById(R.id.Plus);
        _minus = findViewById(R.id.minus);
        _multi = findViewById(R.id.multi);
        _devide = findViewById(R.id.devide);
        _result = findViewById(R.id.Result);


        _plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!_check(0)) {
                    if (!_check(1)) {
                        Error(1);
                    }
                    if (!_check(2)) {
                        Error(2);
                    }
                } else {
                    _result.setText(solution(1));
                }
            }
        });
        _minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!_check(0)) {
                    if (!_check(1)) {
                        Error(1);
                    }
                    if (!_check(2)) {
                        Error(2);
                    }
                } else {
                    _result.setText(solution(2));
                }
            }
        });
        _multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!_check(0)) {
                    if (!_check(1)) {
                        Error(1);
                    }
                    if (!_check(2)) {
                        Error(2);
                    }
                }  else {
                    _result.setText(solution(3));
                }
            }
        });
        _devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!_check(0)) {
                    if (!_check(1)) {
                        Error(1);
                    }
                    if (!_check(2)) {
                        Error(2);
                    }
                }   else{
                    _result.setText(solution(4));
                }
            }
        });

    }

    public void Error(int func) {
        if (func == 1) {
            _num1.setError("Please input num1!!!");
        } else if (func == 2) {
            _num2.setError("Please input num2!!!");
        }
    }

    public boolean _check(int func) {
        if (func == 0) {
            if (_num1.getText().toString().isEmpty() || _num2.getText().toString().isEmpty()) {
                return false;
            }
        }
        else if (func == 1) {
            if (_num1.getText().toString().isEmpty()) {
                return false;
            }
        }

        else if (func == 2) {
            if (_num2.getText().toString().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public String solution(int solve) {
        DecimalFormat frm = new DecimalFormat(",###.##");
        double num = 0;
        if (solve == 1) {
            num = Double.parseDouble(_num1.getText().toString()) + Double.parseDouble(_num2.getText().toString());
        } else if (solve == 2) {
            num = Double.parseDouble(_num1.getText().toString()) - Double.parseDouble(_num2.getText().toString());
        } else if (solve == 3) {
            num = Double.parseDouble(_num1.getText().toString()) * Double.parseDouble(_num2.getText().toString());
        } else if (solve == 4) {
            num = Double.parseDouble(_num1.getText().toString()) / Double.parseDouble(_num2.getText().toString());
        }

        return "Result = " + frm.format(num);
    }
}
