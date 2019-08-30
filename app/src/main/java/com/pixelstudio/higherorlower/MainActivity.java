package com.pixelstudio.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int rand_int1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        rand_int1 = rand.nextInt(20) + 1 ;

    }

    public void makeToast(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    public void ButtonFunction(View view) {
        EditText editText = findViewById(R.id.userEntry);
        String userInput = editText.getText().toString();
        int userInt = Integer.parseInt(userInput);
        if (rand_int1 > userInt) {
            makeToast("Higher");
        } else if (rand_int1 < userInt) {
            makeToast("Lower");
        }
        else {
            makeToast("That's correct");
            Random rand = new Random();
            rand_int1 = rand.nextInt(20) + 1 ;
        }

    }
}
