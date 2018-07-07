package com.example.pavan.someproject;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<details> arrayList = new ArrayList<details>();
        arrayList.add(new details());
        arrayList.add(new details());
        arrayList.add(new details());
        arrayList.add(new details());
        arrayList.add(new details());
        arrayList.add(new details());
        arrayList.add(new details());
        arrayList.add(new details());


        ListView listView = (ListView)findViewById(R.id.listview);
        customadapter c = new customadapter(this,arrayList);
        listView.setAdapter(c);



















































    }
}
