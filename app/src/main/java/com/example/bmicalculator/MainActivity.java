package com.example.bmicalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bmicalculator.model.Human;


public class MainActivity extends AppCompatActivity {

    private Human bmi  = new Human();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText view = (EditText) findViewById(R.id.editText2);
        EditText view1 = (EditText) findViewById(R.id.editText3);
if(view == null || view1==null) {
    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    builder.setTitle("ผิดพลาด");
    builder.setMessage("ป้อนข้อมูลไม่ครบ");
    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {

        @Override
        public void onClick(DialogInterface dialog, int Which) {
        }
    });
    builder.show();


}



    Button nub = (Button) findViewById(R.id.button2);
     nub.setOnClickListener(new View.OnClickListener()
     {
        public void onClick (View view){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("text", Human.getBMI());
        intent.putExtra("Textview", Human.getGan());
        startActivity(intent);
    }
    });}}


