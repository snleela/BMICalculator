package com.example.bmicalculator.model;

import android.widget.EditText;

import com.example.bmicalculator.R;


public class Human {


        public static double getBMI(){
            Double BMI=0.0;
            String n= String.valueOf((R.id.editText3));
           Double number = Double.parseDouble(n);
            String m= String.valueOf((R.id.editText2));
            Double number2 = Double.parseDouble(m);
            BMI = (number/((number2*number2)/100));
             return BMI;
        }


        public static String getGan() {
            Human human =new Human();
            Double Bmi =human.getBMI();
            String gan = "";
            if (Bmi< 18.5) {
                gan="นํ้าหนักน้อยกว่าปกติ(ผอม)";
                return gan;
            }
            else if (Bmi < 25.0) {
                gan="นํ้าหนักน้อยกว่าปกติ";
                return gan;
            }
            else if (Bmi < 30.0) {
                gan= "นํ้าหนักมากกว่าปกติ(ท้วม)";
                return gan;
            }
            else if (Bmi >= 30.0) {
                gan= "นํ้าหนักมากกว่าปกติมาก(อ้วน)";
                return gan;
            }
            return gan;
        }}

