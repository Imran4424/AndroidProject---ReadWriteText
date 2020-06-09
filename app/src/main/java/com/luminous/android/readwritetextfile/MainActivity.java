package com.luminous.android.readwritetextfile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputString;
    TextView savedText;
    TextView currentScore;
    Button saveButton;
    Button loadButton;
    Button incrementButton;
    Button decrementButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputString = (EditText) findViewById(R.id.inputText);
        savedText = (TextView) findViewById(R.id.savedText);
        currentScore = (TextView) findViewById(R.id.scoreText);
        saveButton = (Button) findViewById(R.id.saveButton);
        loadButton = (Button) findViewById(R.id.loadButton);
    }
}