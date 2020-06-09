package com.luminous.android.readwritetextfile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    private static final String STRING_TXT = "String.txt";
    private static final String SCORE_TXT = "Score.txt";

    EditText inputString;
    TextView savedText;
    TextView currentScore;
    Button saveButton;
    Button loadButton;
    Button incrementButton;
    Button decrementButton;
    Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputString = (EditText) findViewById(R.id.inputText);
        savedText = (TextView) findViewById(R.id.savedText);
        currentScore = (TextView) findViewById(R.id.scoreText);
        saveButton = (Button) findViewById(R.id.saveButton);
        loadButton = (Button) findViewById(R.id.loadButton);
        incrementButton = (Button) findViewById(R.id.incrementButton);
        decrementButton = (Button) findViewById(R.id.decrementButton);
        resetButton = (Button) findViewById(R.id.resetButton);
    }

    public void saveString(View view) {
        writeFile();
    }

    private void writeFile() {
        String textToSave = inputString.getText().toString();

        try {
            FileOutputStream fileOutputStream = openFileOutput(STRING_TXT, MODE_PRIVATE);
            fileOutputStream.write(textToSave.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadString(View view) {
        readFile();
    }

    private void readFile() {
        try {
            FileInputStream fileInputStream = openFileInput(STRING_TXT);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuffer stringBuffer = new StringBuffer();

            String lines;
            while ((lines = bufferedReader.readLine()) != null) {
                stringBuffer.append(lines + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void incrementScore(View view) {

    }

    public void decrementScore(View view) {

    }

    public void resetScore(View view) {

    }
}