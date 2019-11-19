package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugas3.adapters.TrailAdapter;
import com.example.tugas3.models.Trail;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvTrail;
    List<Trail> listTrail= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menyambungkan rvTrail ke layout
        rvTrail = findViewById(R.id.rvTrail);
        //Membuat object trail
        Trail trail = new Trail("KTM", R.drawable.ktm);
        //menambahkan TRAIL ke listtrail
        listTrail.add(trail);
        //membuat object trail baru
        trail = new Trail("CRF", R.drawable.crf);
        listTrail.add(trail);
        trail = new Trail("YZ", R.drawable.yz);
        listTrail.add(trail);
        trail = new Trail("RMZ", R.drawable.rmz);
        listTrail.add(trail);
        trail = new Trail("KX", R.drawable.kx);
        listTrail.add(trail);


        TrailAdapter trailAdapter = new TrailAdapter(listTrail);
        rvTrail.setAdapter(trailAdapter);
        rvTrail.setLayoutManager(new GridLayoutManager(this, 2));
    }
}