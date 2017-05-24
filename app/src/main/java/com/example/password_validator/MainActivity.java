package com.example.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public boolean validate(String password){

        //these are the inital tests from the assignment
        if(password.equals("password") || password.length()<8) return false;

        //this test checks to see if the first letter is a capital
        if(!Character.isUpperCase(password.charAt(0))) return false;

        //this checks if there are both uppercase and lowercase characters in the password
        if(password.equals(password.toLowerCase())||password.equals(password.toUpperCase())) return false;

        //this checks if the string contains a digit
        if(!password.matches(".*\\d+.*")) return false;

        return true;
    }
}
