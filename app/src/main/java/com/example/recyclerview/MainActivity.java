package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final static  String[] pictureName = {
            "Rocket in the universe",
            "A scene in London",
            "Moon over mountains",
            "A simple moon",
            "Sun and volcano",
            "A collection of mountains",
            "River between mountains",
            "Some pine trees",
            "On Small Town",
            "Volcanoes reflection"
    };

    private final static Integer[] pictureIds = {
            R.drawable.cohete_flat,
            R.drawable.london_flat,
            R.drawable.material_flat,
            R.drawable.moon_flat,
            R.drawable.mountain_flat,
            R.drawable.mountain_mo_flat,
            R.drawable.moutain_go_flat,
            R.drawable.pine_flat,
            R.drawable.towers_flat,
            R.drawable.vulcan_flat
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<imageModel> list =fetchData();

        ImagesAdapter imagesAdapter = new ImagesAdapter(list);

        RecyclerView rvImages = findViewById(R.id.rv_images);

        rvImages.setAdapter(imagesAdapter);

        rvImages.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
    }

    private ArrayList<imageModel> fetchData() {
        ArrayList<imageModel> data = new ArrayList<imageModel>();

        for (int i = 0; i < pictureIds.length; i++){
            imageModel newItem = new imageModel (pictureName[i],pictureIds[i]);
            data.add(newItem);
        }
        return data;
    }
}