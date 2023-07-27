package com.example.calcipractise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void Sum(View v){
        EditText et1=findViewById(R.id.editTextNumber);
        EditText et2=findViewById(R.id.editTextNumber2);
        TextView et3=findViewById(R.id.textView);

        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1+n2;

         et3.setText("sum value"+ result);
    }

    public void Subtract(View v){
        EditText et1=findViewById(R.id.editTextNumber);
        EditText et2=findViewById(R.id.editTextNumber2);
        TextView et3=findViewById(R.id.textView);

        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1-n2;

        et3.setText("subtracted value"+ result);
    }
    public void Multiply(View v){
        EditText et1=findViewById(R.id.editTextNumber);
        EditText et2=findViewById(R.id.editTextNumber2);
        TextView et3=findViewById(R.id.textView);

        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1*n2;

        et3.setText("multiplied value"+ result);
    }

    public void Divide(View v){
        EditText et1=findViewById(R.id.editTextNumber);
        EditText et2=findViewById(R.id.editTextNumber2);
        TextView et3=findViewById(R.id.textView);

        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1/n2;

        et3.setText("divided value"+ result);
    }

}




