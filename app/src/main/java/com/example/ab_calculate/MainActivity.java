package com.example.ab_calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText firstNumber;
        EditText secondNumber;
        EditText addResult;
        Button btnAdd;


        firstNumber = (EditText) findViewById(R.id.numa);
        secondNumber = (EditText) findViewById(R.id.numb);
        addResult = (EditText) findViewById(R.id.numab);
        btnAdd = (Button) findViewById(R.id.addbtn);

        btnAdd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                double numbera, numberb, sum;
                numbera = Double.parseDouble(firstNumber.getText().toString());
                numberb = Double.parseDouble(secondNumber.getText().toString());
                sum = numbera + numberb;
                addResult.setText(Double.toString(sum));
            }
        });
    }
}