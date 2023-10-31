package com.example.learning_english;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterListView extends BaseAdapter {
    ArrayList<Model> arrayList = new ArrayList<>();
    Context context;
//  Defining a constructor to initialize the Context and ArrayList that actually stores the information of each item in itself.
    public AdapterListView(ArrayList<Model> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }
//  The method of counting the number of items.
    @Override
    public int getCount() {
        return arrayList.size();
    }
//   Method of getting items.
    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }
//  The method of getting the position (unique ID) of each item.
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
//      Attaching an XML layer to the ListView.
        if(view == null) view = LayoutInflater.from(context).inflate(R.layout.activity_items_list,viewGroup,false);
//      Introducing views and widgets.
        TextView txt_title_En, txt_title_Fa;
        CircleImageView circleImageView;

        circleImageView = view.findViewById(R.id.cir_imageView);
        txt_title_En = view.findViewById(R.id.txt_title_En);
        txt_title_Fa = view.findViewById(R.id.txt_title_Fa);
//      Getting each item using the position to use it.
        Model model = arrayList.get(position);
//      Howing to display each item in its own place.
        circleImageView.setBackgroundResource(model.getImage());
        txt_title_En.setText(model.getTitle_En());
        txt_title_Fa.setText(model.getTitle_Fa());
        return view;
    }
}
