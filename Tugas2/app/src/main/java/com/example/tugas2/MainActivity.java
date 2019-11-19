package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugas1.adapters.TrailAdapter;
import com.example.tugas1.models.Trail;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvTrail;
    List<Trail> listTrail = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menyambungkan rvTrail ke layout
        rvTrail = findViewById(R.id.rvTrail);
        //Membuat object trail
        Trail trail = new Trail("KTM", R.drawable.ktm);
        //menambahkan club ke listTrail
        listTrail.add(trail);
        //membuat object trail baru
        trail = new Trail("CRF", R.drawable.crf);
        listTrail.add(trail);

//        com.example.tugas1.adapters.ClubAdapter clubAdapter = new com.example.tugas1.adapters.ClubAdapter(listClub);
        TrailAdapter trailAdapter = new TrailAdapter(listTrail);
        rvTrail.setAdapter(trailAdapter);
        rvTrail.setLayoutManager(new LinearLayoutManager(this));
    }
}