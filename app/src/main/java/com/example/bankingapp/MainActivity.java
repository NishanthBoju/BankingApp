package com.example.bankingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText username,password;
Button qer;
    private EditText favcolor;
    RadioGroup rg;
    RadioButton rb1,rb2,rb3;
public static final String extra_num="com.example.bankingapp.example.extra_num";
    public static final String extra_user="com.example.bankingapp.example.extra_num";
    public static final String extra_pass="com.example.bankingapp.example.extra_num";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=findViewById(R.id.RG);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rb3=findViewById(R.id.rb3);
//rb2.setOnClickListener();
        //username=(EditText)findViewById(R.id.editText);

       // password=(EditText)findViewById(R.id.editText2);
        //favcolor = (EditText) findViewById(R.id.editText4);


        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            openActivity2();
            }
        });

    }

    public void openActivity2(){
   String num="";
       int num1=0;

        EditText edt1=(EditText)findViewById(R.id.editText);
        String user=edt1.getText().toString();
        EditText edt2=(EditText)findViewById(R.id.editText2);
        String pass=edt2.getText().toString();
       if(user.contentEquals("banking")&&pass.contentEquals("1234")) {

           rb1=findViewById(R.id.rb1);
           rb2=findViewById(R.id.rb2);
    rb3=findViewById(R.id.rb3);

           if(rb1.isChecked()){
               num="10000";
           }else if(rb2.isChecked()){
                   EditText edt=(EditText)findViewById(R.id.editText4);
                    num=edt.getText().toString();
                    if(num.contentEquals("")){
                        num1=0;
                    }else {
                         num1 = Integer.parseInt(num);
                    }
               num1+=10000;
               num=""+num1;
           }else if(rb3.isChecked()){
                   EditText edt=(EditText)findViewById(R.id.editText4);
                    num=edt.getText().toString();
               if(num.contentEquals("")){
                    num1=0;
               }else {
                    num1 = Integer.parseInt(num);
               }
               int num2=num1;
               num1=10000-num2;
               num=""+num1;
           }
String disp="Your Current Balance is\n"+num+" CAD";

           //txt2.setText("Sorry Invalid Username or Password")
           Intent intent = new Intent(this, Main2Activity.class);
           intent.putExtra(extra_user, disp);
         //  intent.putExtra(extra_pass, pass);
          // intent.putExtra(extra_num, num);
           startActivity(intent);
       }else{
           String disp="Sorry Invalid username or password";

           Intent intent = new Intent(this, Main2Activity.class);
           intent.putExtra(extra_user, disp);
           //  intent.putExtra(extra_pass, pass);
        //   intent.putExtra(extra_num, num);
           startActivity(intent);
       }
    }
}
