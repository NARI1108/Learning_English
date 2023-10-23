package com.example.learning_english;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_list,  btn_about,  btn_exit, btn_contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        animation();
    }
    public void findViews(){
         btn_list= findViewById(R.id.btn_list);
         btn_about = findViewById(R.id.btn_about_us);
         btn_contact = findViewById(R.id.btn_contact_us);
         btn_exit = findViewById(R.id.btn_exit);

    }
    public void animation(){
        Animation list = AnimationUtils.loadAnimation(this,R.anim.trans_left);
        Animation about = AnimationUtils.loadAnimation(this,R.anim.trans_left);
        Animation contact = AnimationUtils.loadAnimation(this,R.anim.trans_left);
        Animation exit = AnimationUtils.loadAnimation(this,R.anim.trans_left);
        btn_list.setAnimation(list);
        btn_about.setAnimation(about);
        btn_contact.setAnimation(contact);
        btn_exit.setAnimation(exit);
    }
}