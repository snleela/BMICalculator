package com.example.bmicalculator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String str = intent.getStringExtra("text");
        String baiHuay = intent.getStringExtra("textview");

        TextView text1= (TextView) findViewById(R.id.textView2);
        text1.setText(str);
        TextView textview1 = (TextView) findViewById(R.id.textView6);
        textview1.setText(baiHuay);


    }

}
