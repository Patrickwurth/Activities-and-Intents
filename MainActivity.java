package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String MESSAGE_MAIN = "com.example.twoactivities.extra.MESSAGE";
    public static final String MESSAGE_Choice = "com.example.twoactivities.extra.MESSAGE";

    private EditText mMessageEditText_one;
    private EditText mMessageEditText_two;
    private EditText mMessageEditText_three;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMessageEditText_one = findViewById(R.id.editText_main);
        mMessageEditText_two = findViewById(R.id.editText_second);
        mMessageEditText_three = findViewById(R.id.editText_third);
    }

    //First Button
    public void launchSecondActivity_one(View view) {
        Log.d(LOG_TAG, "Button 1 clicked!");
        String message = mMessageEditText_one.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(MESSAGE_MAIN,message);
        intent.putExtra("MESSAGE_Choice",1);

        startActivity(intent);
    }

    //Second Button
    public void launchSecondActivity_two(View view) {
        Log.d(LOG_TAG, "Button 2 clicked!");
        String message = mMessageEditText_two.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(MESSAGE_MAIN,message);
        intent.putExtra("MESSAGE_Choice",2);
        startActivity(intent);
    }

    //Third Button
    public void launchSecondActivity_three(View view) {
        Log.d(LOG_TAG, "Button 3 clicked!");
        String message = mMessageEditText_three.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(MESSAGE_MAIN,message);
        intent.putExtra("MESSAGE_Choice",3);
        startActivity(intent);

    }
}