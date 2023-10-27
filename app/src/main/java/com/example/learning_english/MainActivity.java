package com.example.learning_english;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
//    Clicking method on all views.
    public void btn_click(View view) {
        switch(view.getId()){
            case R.id.btn_list:
                startActivity(new Intent(MainActivity.this,list.class));
                break;
            case R.id.btn_about_us:
                startActivity(new Intent(MainActivity.this,about_us.class));
                break;
            case R.id.btn_contact_us:
                contactUs();
                break;
            case R.id.btn_exit:
                exit_Dialog();
        }
    }
    //    This method actually determines whether the person can exit or not.
    @Override
    public void onBackPressed(){
        exit_Dialog();
    }
    void exit_Dialog(){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage(getResources().getString(R.string.message_exit));
        alert.setCancelable(false);
        alert.setPositiveButton("بله", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alert.setNegativeButton("نه", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        alert.create().show();
    }
}