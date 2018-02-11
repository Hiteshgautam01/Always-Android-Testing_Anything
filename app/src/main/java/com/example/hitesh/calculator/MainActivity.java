package com.example.hitesh.calculator;

import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText number1;
    private EditText number2;
    private Button add;
    private Button min;
    private Button div;
    private Button mul;

    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (EditText)findViewById(R.id.num1);
        number2 = (EditText)findViewById(R.id.num2);
        add = (Button)findViewById(R.id.sumbut);
        min = (Button)findViewById(R.id.minbut);
        mul = (Button)findViewById(R.id.mulbut);
        div = (Button)findViewById(R.id.divbut);
        result = (TextView)findViewById(R.id.sum);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numb1 = Integer.parseInt(number1.getText().toString());
                int numb2 = Integer.parseInt(number2.getText().toString());
                int sum = numb1 + numb2;
                result.setText(String.valueOf(sum));
            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numb1 = Integer.parseInt(number1.getText().toString());
                int numb2 = Integer.parseInt(number2.getText().toString());
                int subtraction = numb1 - numb2;
                result.setText(String.valueOf(subtraction));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numb1 = Integer.parseInt(number1.getText().toString());
                int numb2 = Integer.parseInt(number2.getText().toString());
                int multiplication = numb1 * numb2;
                result.setText(String.valueOf(multiplication));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numb1 = Integer.parseInt(number1.getText().toString());
                int numb2 = Integer.parseInt(number2.getText().toString());
                int division = numb1 / numb2;
                result.setText(String.valueOf(division));
            }
        });
    }



}

