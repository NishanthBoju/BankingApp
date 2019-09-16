package com.example.bankingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
     //   int num1 = intent.getIntExtra(MainActivity.extra_num, 111);
        String disp=intent.getStringExtra(MainActivity.extra_user);
       // String pass=intent.getStringExtra(MainActivity.extra_pass);

        TextView txt1 = (TextView) findViewById(R.id.textView25);
      //  TextView txt2=(TextView)findViewById(R.id.textView24);
        txt1.setText(disp);
       // txt2.setText("");
    }
}
