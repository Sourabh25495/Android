package com.example.sourabhkulkarni.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private static Button b1,b2,b3,b4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


//this is a comment
        public void onButtonClick (View v){
            EditText e1 = (EditText) findViewById(R.id.editText);
            EditText e2 = (EditText) findViewById(R.id.editText2);
            TextView t1 = (TextView) findViewById(R.id.editText3);

            int num1 = Integer.parseInt((e1.getText().toString()));
            int num2 = Integer.parseInt(e2.getText().toString());
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));


        }
    public void onButtonClick1 (View v){
        EditText e1 = (EditText) findViewById(R.id.editText);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        TextView t1 = (TextView) findViewById(R.id.editText3);

        int num1 = Integer.parseInt((e1.getText().toString()));
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 - num2;
        t1.setText(Integer.toString(sum));


    }
    public void onButtonClick2 (View v){
        EditText e1 = (EditText) findViewById(R.id.editText);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        TextView t1 = (TextView) findViewById(R.id.editText3);

        int num1 = Integer.parseInt((e1.getText().toString()));
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 * num2;
        t1.setText(Integer.toString(sum));


    }
    public void onButtonClick3 (View v){
        EditText e1 = (EditText) findViewById(R.id.editText);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        TextView t1 = (TextView) findViewById(R.id.editText3);

        int num1 = Integer.parseInt((e1.getText().toString()));
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 / num2;
        t1.setText(Integer.toString(sum));


    }
    }

