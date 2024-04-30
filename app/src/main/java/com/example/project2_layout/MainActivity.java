package com.example.project2_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText EnterHobby;
    private TextView hobbytext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EnterHobby=findViewById(R.id.HobbiesText);
        hobbytext=findViewById(R.id.hobbytext);

    }


    public void Addhobby(View view) {
        hobbytext.setText(String.format("Hobbies: %s",EnterHobby.getText().toString()));
        hobbytext.setVisibility(View.VISIBLE);
        // hide the input text
        InputMethodManager inputMethodManager=(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(),0);
    }
}