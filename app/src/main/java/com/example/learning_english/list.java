package com.example.learning_english;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class list extends AppCompatActivity {
    ListView list_View;
//    Creating a dynamic presentation to store the necessary variables for list view items.
    ArrayList<Model> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        findViews();
        modelItems();
    }
    public void findViews(){
        list_View = findViewById(R.id.list_View);
    }
//    Value presentation related to the list of conversations.
    public void modelItems(){
        arrayList.add(new Model(R.drawable.bag,"A New Bag","یک کیف جدید"));
        arrayList.add(new Model(R.drawable.birthday,"Birthday Present","کادوی تولدت"));
        arrayList.add(new Model(R.drawable.hard,"Hard To Shop for","سخت است خرید کردن برای"));
        arrayList.add(new Model(R.drawable.smart,"SmartWatch","ساعت هوشمند"));
        arrayList.add(new Model(R.drawable.losing,"losing Weight","کم کردن وزن"));
        arrayList.add(new Model(R.drawable.getajob,"get a go","برو سرکار"));
    }

}