package com.example.administrator.hello;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tv;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();


    }



    private void initViews() {
        tv= (TextView) findViewById(R.id.tv_show);
        btn= (Button) findViewById(R.id.btn_color);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_color:
                String s="#"+getColor();
                tv.setTextColor(Color.parseColor(s));
                break;
        }
    }

    private String getColor() {
        int c = new Random().nextInt((255 * 255 * 255));
        String color = String.format("%04x", c);
        while(color.length()<6){
            color="1"+color;
        }
        return color;




    }





}
