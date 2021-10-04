package com.example.xo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnReset, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        btn1.setOnClickListener(this::btnClick);
        btn2.setOnClickListener(this::btnClick);
        btn3.setOnClickListener(this::btnClick);
        btn4.setOnClickListener(this::btnClick);
        btn5.setOnClickListener(this::btnClick);
        btn6.setOnClickListener(this::btnClick);
        btn7.setOnClickListener(this::btnClick);
        btn8.setOnClickListener(this::btnClick);
        btn9.setOnClickListener(this::btnClick);

        btnReset.setOnClickListener(view -> {
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn9.setText("");
        });



    }


    public void btnClick(View v){

    }

}