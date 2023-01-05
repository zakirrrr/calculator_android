package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et;
    private TextView textView;
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b_add,b_sub,b_mul,b_div,b_eql,b_pnt,reset;
    private boolean add,sub,mul,div;
    private double value1,value2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.input);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);
        b7=findViewById(R.id.btn7);
        b8=findViewById(R.id.btn8);
        b9=findViewById(R.id.btn9);
        b0=findViewById(R.id.btn0);
        b_add=findViewById(R.id.btn_add);
        b_sub=findViewById(R.id.btn_sub);
        b_mul=findViewById(R.id.btn_mul);
        b_div=findViewById(R.id.btn_div);
        b_eql=findViewById(R.id.btn_eql);
        b_pnt=findViewById(R.id.btn_pnt);
        reset=findViewById(R.id.reset);
        textView=findViewById(R.id.textview);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText().toString()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText().toString()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText().toString()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText().toString()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText().toString()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText().toString()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText().toString()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText().toString()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText().toString()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText().toString()+"0");
            }
        });
        b_pnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText().toString()+".");
            }
        });
        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Double.parseDouble(et.getText().toString());
                add = true;
                et.setText("");
            }
        });
        b_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Double.parseDouble(et.getText().toString());
                sub = true;
                et.setText("");
            }
        });
        b_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Double.parseDouble(et.getText().toString());
                mul = true;
                et.setText("");
            }
        });
        b_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Double.parseDouble(et.getText().toString());
                div = true;
                et.setText("");
            }
        });
        b_eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value2 = Double.parseDouble(et.getText().toString());
                if (add == true){
                    result = value1 + value2;
                    et.setText(String.valueOf(result));
                    textView.setText(String.valueOf(value1 +"+"+value2));
                }
                else if (sub == true){
                    result = value1 - value2;
                    et.setText(String.valueOf(result));
                    textView.setText(String.valueOf(value1 +"-"+value2));
                }
                else if (mul == true){
                    result = value1 * value2;
                    et.setText(String.valueOf(result));
                    textView.setText(String.valueOf(value1 +"*"+value2));
                }
                else if (div == true){
                    result = value1 / value2;
                    et.setText(String.valueOf(result));
                    textView.setText(String.valueOf(value1 +"/"+value2));
                }
                add= sub = mul = div= false;
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                et.setText("");
                textView.setText("");
            }
        });

    }
}