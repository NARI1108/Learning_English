package com.example.learning_english;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Lessons extends AppCompatActivity {
    
    String [] title_list ={"A New Bag","Hard to Shop For","Birthday Present","Losing Weight","Get a Job","Smartwatch"};
    String [] conversation_En_list = new String[6];
    String [] conversation_Fa_list = new String[6];
    TextView txt_title, txt_conversation_En, txt_conversation_Fa;
    Button btn_speak;
    ToggleButton btn_translate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);
        findViews();
        initializationOfArrays();
    }
    public void findViews(){
        txt_title = findViewById(R.id.txt_title);
        txt_conversation_En = findViewById(R.id.txt_conversation_En);
        txt_conversation_Fa = findViewById(R.id.txt_conversation_Fa);
        btn_speak = findViewById(R.id.btn_speak);
        btn_translate = findViewById(R.id.btn_translate);
    }
    public void initializationOfArrays(){
//        Quantification of the presentation related to the text of the conversations (English).
        conversation_En_list [0] = getResources().getString(R.string.con1_E);
        conversation_En_list [1] = getResources().getString(R.string.con2_E);
        conversation_En_list [2] = getResources().getString(R.string.con3_E);
        conversation_En_list [3] = getResources().getString(R.string.con4_E);
        conversation_En_list [4] = getResources().getString(R.string.con5_E);
        conversation_En_list [5] = getResources().getString(R.string.con6_E);
//        Quantification of presentation related to the text of conversations (Persian).
        conversation_Fa_list [0] = getResources().getString(R.string.con1_F);
        conversation_Fa_list [1] = getResources().getString(R.string.con2_F);
        conversation_Fa_list [2] = getResources().getString(R.string.con3_F);
        conversation_Fa_list [3] = getResources().getString(R.string.con4_F);
        conversation_Fa_list [4] = getResources().getString(R.string.con5_F);
        conversation_Fa_list [5] = getResources().getString(R.string.con6_F);
    }
}