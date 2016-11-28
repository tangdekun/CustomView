package com.view.john.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.rgS);
        RadioButton radioButton = new RadioButton(this);
        radioButton.setBackgroundResource(R.drawable.select_drawable);
        radioButton.setButtonDrawable(null);
        radioButton.setTextSize(8);
        radioButton.setGravity(Gravity.CENTER|Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL);
        radioButton.setWidth(60);
        radioButton.setHeight(60);
        radioButton.setText("1");
        radioGroup.addView(radioButton);
        RadioButton radioButton1 = new RadioButton(this);
        radioButton1.setBackgroundResource(R.drawable.select_drawable);
        radioButton1.setButtonDrawable(null);
        radioButton1.setTextSize(8);
        radioButton1.setGravity(Gravity.CENTER|Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL);
        radioButton1.setWidth(60);
        radioButton1.setHeight(60);
        radioButton1.setText("1");
        radioGroup.addView(radioButton1);

    }
}
