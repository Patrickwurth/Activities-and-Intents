package com.example.twoactivities;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String message = intent.getStringExtra(MainActivity.MESSAGE_MAIN);
        int choice = getIntent().getExtras().getInt("MESSAGE_Choice");

        switch(choice){
            case 2: TextView textView2 = findViewById(R.id.textView2);textView2.setText(message); ;break;
            case 3: TextView textView3 = findViewById(R.id.textView3);textView3.setText(message);break;
            default: TextView textView1 = findViewById(R.id.textView1);textView1.setText(message);
        }
    }

}