package com.freetoreads.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RelativeLayout extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonequal, buttonclear, buttonmultiply, buttondivide, buttonadd, buttonsubtract, buttondot;
    EditText numanswer;
    TextView reservetext;
    float num1, num2;
    boolean isadd, issubtract, ismultiply, isdivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        button0 = (Button) findViewById(R.id.Button0);
        button1 = (Button) findViewById(R.id.Button1);
        button2 = (Button) findViewById(R.id.Button2);
        button3 = (Button) findViewById(R.id.Button3);
        button4 = (Button) findViewById(R.id.Button4);
        button5 = (Button) findViewById(R.id.Button5);
        button6 = (Button) findViewById(R.id.Button6);
        button7 = (Button) findViewById(R.id.Button7);
        button8 = (Button) findViewById(R.id.Button8);
        button9 = (Button) findViewById(R.id.Button9);
        buttondot = (Button) findViewById(R.id.ButtonDot);
        buttonclear = (Button) findViewById(R.id.ButtonClear);
        buttonequal = (Button) findViewById(R.id.ButtonEqual);
        buttondivide = (Button) findViewById(R.id.ButtonDivide);
        buttonmultiply = (Button) findViewById(R.id.ButtonMultiply);
        buttonadd = (Button) findViewById(R.id.ButtonPlus);
        buttonsubtract = (Button) findViewById(R.id.ButtonMinus);
        numanswer = (EditText) findViewById(R.id.Answer);
        reservetext = (TextView) findViewById(R.id.ReserveText);

        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numanswer.setText(numanswer.getText() + ".");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numanswer.setText(numanswer.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numanswer.setText(numanswer.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numanswer.setText(numanswer.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numanswer.setText(numanswer.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numanswer.setText(numanswer.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numanswer.setText(numanswer.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numanswer.setText(numanswer.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numanswer.setText(numanswer.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numanswer.setText(numanswer.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numanswer.setText(numanswer.getText() + "9");
            }
        });

        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numanswer.setText("");
                reservetext.setText("");
                isadd = false;
                issubtract = false;
                ismultiply = false;
                isdivide = false;
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(numanswer == null) {
                    numanswer.setText("");
                } else {
                    num1 = Float.parseFloat(numanswer.getText() + "");
                    isadd = true;
                    reservetext.setText(num1 + " + ");
                    numanswer.setText(null);
                }
            }
        });

        buttonsubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(numanswer.getText() + "");
                issubtract = true;
                reservetext.setText(num1 + " - ");
                numanswer.setText(null);
            }
        });

        buttonmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(numanswer.getText() + "");
                ismultiply = true;
                reservetext.setText(num1 + " * ");
                numanswer.setText(null);
            }
        });

        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(numanswer.getText() + "");
                isdivide = true;
                reservetext.setText(num1 + " / ");
                numanswer.setText(null);
            }
        });

        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat(numanswer.getText() + "");

                if (isadd == true) {
                    reservetext.setText(num1 + " + " + num2);
                    numanswer.setText("= " + (num1 + num2));
                }

               else if (issubtract == true) {
                    reservetext.setText(num1 + " - " + num2);
                    numanswer.setText("= " + (num1 - num2));
                }

                else if (ismultiply == true) {
                    reservetext.setText(num1 + " * " + num2);
                    numanswer.setText("= " + (num1 * num2));
                }

                else if (isdivide == true) {
                    reservetext.setText(num1 + " / " + num2);
                    numanswer.setText("= " + (num1 / num2));
                }
            }
        });
    }
}