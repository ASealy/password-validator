package com.example.password_validator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }


    public String password;
    @Before
    public void initialize(){
        password="Password1234";
    }

    @Test
    public void validate(){

        assertTrue(MainActivity.validate(password));

        /*
        //these are the inital tests from the assignment
        assertTrue(!MainActivity.password.equals("password") && MainActivity.password.length()>=8);


        //this test checks to see if the first letter is a capital
        assertTrue(Character.isUpperCase(MainActivity.password.charAt(0)));

        //this checks if there are both uppercase and lowercase characters in the password
        assertTrue(!MainActivity.password.equals(MainActivity.password.toLowerCase()));
        assertTrue(!MainActivity.password.equals(MainActivity.password.toUpperCase()));

        //this checks if the string contains a digit
        assertTrue(MainActivity.password.matches(".*\\d+.*"));
    */
    }
}