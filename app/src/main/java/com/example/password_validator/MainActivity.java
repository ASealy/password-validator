package com.example.password_validator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void event(View view) {
        EditText editText = (EditText) findViewById(R.id.input);
        String message = editText.getText().toString();


        if(validate(message)) {
            TextView textView = (TextView) findViewById(R.id.display);
            textView.setText("Password is Valid.");
        }
        else{
            TextView textView = (TextView) findViewById(R.id.display);
            textView.setText("Password is NOT Valid.");
        }
    }

    public static boolean validate(String password){

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
