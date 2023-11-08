package com.example.learning_english;

import android.graphics.Color;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Locale;

public class Lessons extends AppCompatActivity {
    int position;
    String [] title_list ={"A New Bag", "Birthday Present", "Hard to Shop For", "Smartwatch", "Losing Weight", "Get a Job"};
    String [] conversation_En_list = new String[6];
    String [] conversation_Fa_list = new String[6];
    TextView txt_title, txt_conversation_En, txt_conversation_Fa;
    Button btn_speak;
    ToggleButton btn_translate;
    TextToSpeech textToSpeech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);
        findViews();
        putExtra();
        initializationOfArrays();
        translate();
    }
    public void findViews(){
        txt_title = findViewById(R.id.txt_title);
        txt_conversation_En = findViewById(R.id.txt_conversation_En);
        txt_conversation_Fa = findViewById(R.id.txt_conversation_Fa);
        btn_speak = findViewById(R.id.btn_speak);
        btn_translate = findViewById(R.id.btn_translate);
    }
    public void putExtra(){
//        Getting the position of each item through the Internet to identify which item was clicked.
        position = getIntent().getIntExtra("pos",0);
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
//      Setting the text and title of each conversation based on the position we took.
        txt_title.setText(title_list[position]);
        txt_conversation_En.setText(conversation_En_list[position]);
    }
    public void translate(){
//        Button click method that has two different modes to display Farsi and English text.
        btn_translate.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    txt_conversation_En.setText(conversation_Fa_list[position]);
                    txt_conversation_En.setTextColor(Color.GREEN);
                }else{
                    String text = "<pre><strong>Lucy</strong>: Is that a new bag?<br /><br /><span style=\"color: #993366;\"><strong>Carol</strong>: Yes. I got it yesterday.</span><br /><br /><strong>Lucy</strong>: It’s beautiful. Do you like it?<br /><br /><span style=\"color: #993366;\"><strong>Carol</strong>: It’s pretty, but it hurts my shoulder.</span><br /><br /><strong>Lucy</strong>: That’s not good. What are you going to do?<br /><br /><span style=\"color: #993366;\"><strong>Carol</strong>: I think I’m going to return it.</span></pre>";
                    if(position == 0){
                        txt_conversation_En.setText(Html.fromHtml(text));
                    }else{
//                        We made a bet to display the text in html form for the first conversation and normally for the next items.
                        txt_conversation_En.setText(conversation_En_list[position]);
                        txt_conversation_En.setTextColor(getResources().getColor(R.color.black));
                    }
                    txt_conversation_En.setText(conversation_En_list[position]);
                    txt_conversation_En.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
    }
//    By exiting the activity, the pronunciation process stops.
    @Override
    protected void onPause(){
        textToSpeech.stop();
        super.onPause();
    }
//    By touching the return button by the user, the pronunciation process is stopped.
    @Override
    public void onBackPressed(){
        textToSpeech.shutdown();
        super.onBackPressed();
    }
}