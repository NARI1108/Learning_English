package com.example.learning_english;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Lessons extends AppCompatActivity {

    TextView txt_title, txt_conversation_En, txt_conversation_Fa;
    Button btn_speak;
    ToggleButton btn_translate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);
        findViews();
    }
    public void findViews(){
        txt_title = findViewById(R.id.txt_title);
        txt_conversation_En = findViewById(R.id.txt_conversation_En);
        txt_conversation_Fa = findViewById(R.id.txt_conversation_Fa);
        btn_speak = findViewById(R.id.btn_speak);
        btn_translate = findViewById(R.id.btn_translate);
    }
}