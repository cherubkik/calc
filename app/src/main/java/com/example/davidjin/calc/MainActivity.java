package com.example.davidjin.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    TextView mText;
    Button mButton;

    String FirstNumber, SecondNumber;
    Integer Number1, Number2;
    Integer ResultNumber;
    Boolean Second = false;
    Boolean Plus, Minus, Multi, Divide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bClick(View v) {
        mText = findViewById(R.id.textview);
        mButton = findViewById(v.getId());

        switch(v.getId())
        {
            case R.id.button0 :
                if(Second == false)
                    Number1 = Integer.parseInt((String) mButton.getText());
                else
                    Number2 = Integer.parseInt((String) mButton.getText());

                mText.setText(mButton.getText());
                Second = false;
                break;
            case R.id.button7 :
                if(Second == false)
                    Number1 = Integer.parseInt((String) mButton.getText());
                else
                    Number2 = Integer.parseInt((String) mButton.getText());

                mText.setText(mButton.getText());

                Second = false;
                break;
            case R.id.Plus :
                Plus = true;

                if(Second == false)
                    Second = true;

               break;
            case R.id.Minus :
                Minus = true;

                if(Second == false)
                    Second = true;

                break;
            case R.id.Equal :
                if(Plus == true) {
                    ResultNumber = Number1 + Number2;
                    Plus = false;
                }
                else if(Minus == true) {
                    ResultNumber = Number1 - Number2;
                    Minus = false;
                }
                Number1 = ResultNumber;


                mText.setText(String.valueOf(ResultNumber));
                break;

        }
    }
}
