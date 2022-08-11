package com.abokotb.calc1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.EmptyStackException;

public class MainActivity extends AppCompatActivity {
    Button  oneClear,one,two,three,four,five,six,seven,eghit,nine,zero,dobleZero,
            equal,multiply,substraction,divide,add,clearAll,persentage,dot;

    TextView input ,output;
    boolean check = false;
    boolean sum,sub,mul,div,bars;
    Float resalt1 , resalt2 ;

    //TODO do the backSpce button its not work yet !
    //TODO do the doubleZero also button its not work yet !



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.input);
        output = findViewById(R.id.output);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eghit = findViewById(R.id.eghit);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        equal = findViewById(R.id.equal);
        multiply = findViewById(R.id.mult);
        substraction = findViewById(R.id.sub);
        divide = findViewById(R.id.div);
        add = findViewById(R.id.sum);
        dobleZero= findViewById(R.id.dobleZe);
        persentage = findViewById(R.id.modils);
        dot = findViewById(R.id.dot);
        clearAll = findViewById(R.id.clearAll);

        clearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");
                output.setText("");
            }
        });
       /* oneClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.length()-1);  //Remove the last String
                output.setText("");
            }
        });*/


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // input.setText(null);  //his was for empty view after action


                input.setText(input.getText() + "0");
            }
        });
        dobleZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "00");
                output.setText(null);  //his was for empty view after action
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "1");
                output.setText(null);  //his was for empty view after action
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "2");
                output.setText(null);  //his was for empty view after action
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "4");
                output.setText(null);  //his was for empty view after action
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "5");
                output.setText(null);  //his was for empty view after action
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "6");
                output.setText(null);  //his was for empty view after action
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "7");
                output.setText(null);  //his was for empty view after action
            }
        });

        eghit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "8");
                output.setText(null);  //his was for empty view after action
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "9");
                output.setText(null);  //his was for empty view after action
            }
        });

        //   it well work
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){ /*This is not finished*/
             String str=input.getText().toString().trim();
                if(str.length()>0){
                input.setText(str+".");
                    output.setText(null);  //his was for empty view after action

                }else{
                input.setText("0.");
                    output.setText(null);  //his was for empty view after action

                }
        }});

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input == null){
                    input.setText("");
                    output.setText(null);  //his was for empty view after action


                }else{
                    resalt1=Float.parseFloat(input.getText()+"");
                    sum=true;
                    input.setText(null);
                    output.setText(null);  //his was for empty view after action

                }

            }
        });
        substraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input == null){
                    input.setText("");
                    output.setText(null);  //his was for empty view after action

                }else {
                    resalt1=Float.parseFloat(input.getText()+ "");
                    sub=true;
                    input.setText(null);
                    output.setText(null);  //his was for empty view after action

                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input == null){
                    input.setText("");
                    output.setText(null);  //his was for empty view after action

                }else {
                    resalt1=Float.parseFloat(input.getText()+ "");
                    div=true;
                    input.setText(null);
                    output.setText(null);  //his was for empty view after action

                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input == null){
                    input.setText("");
                    output.setText(null);  //his was for empty view after action

                }else {
                    resalt1=Float.parseFloat(input.getText()+ "");
                    mul=true;
                    input.setText(null);
                    output.setText(null);  //his was for empty view after action

                }
            }
        });
        persentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input == null){
                    input.setText("");
                    output.setText(null);  //his was for empty view after action

                }else {
                    resalt1=Float.parseFloat(input.getText()+ "");
                    bars=true;
                    input.setText(null);
                    output.setText(null);  //his was for empty view after action


                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resalt2=Float.parseFloat(input.getText()+ "");

                if(sum == true){
                    //here we chainge output will be input
                    output.setText(resalt1+resalt2+"");
                    sum=false;
                    input.setText(null);  //his was for empty view after action

                }
                if(sub == true){
                    //here we chainge output will be input
                    output.setText(resalt1-resalt2+"");
                    sub=false;
                    input.setText(null); // his was for empty view after action

                }
                if(mul==true){
                    //here we chainge output will be input
                    output.setText(resalt1 * resalt2 +"");
                    mul=false;
                    input.setText(null);  //his was for empty view after action

                }
                if(div == true){
                    //here we chainge output will be input
                    output.setText(resalt1/resalt2+"");
                    sub=false;
                    input.setText(null); //this was for empty view after action


                }
                if(bars==true){
                    Float per=(resalt1%resalt2);
                    //here we chainge output will be input
                    output.setText(per+"");
                    bars=true;
                    input.setText(null);   //his was for empty view after action

                }

            }
        });

    }
}