package com.example.project04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private OrganisasiAdapter adapter;
    private ArrayList<Organisasi> elektronikArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView=(RecyclerView) findViewById(R.id.recyclerView);
        adapter = new OrganisasiAdapter(elektronikArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager((layoutManager));
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        elektronikArrayList = new ArrayList<>();
        elektronikArrayList.add(new Organisasi("K_Jerag Company", " KJerag", "Pendanaan dan Perlengkapan",R.drawable.k_lerag));
        elektronikArrayList.add(new Organisasi("Victoria Foundation", "Victoria", "Penyerangan dan Perlindungan",R.drawable.lionkingdom));
        elektronikArrayList.add(new Organisasi("Penguin Logistik", "Artic", "Pengadaan Barang",R.drawable.penguinlogistic));
        elektronikArrayList.add(new Organisasi("Rhine Lab", "Laterano", "Medis dan Kimia",R.drawable.rhineab));
        elektronikArrayList.add(new Organisasi("Rhodes Island", "Tidak Ada, Berpindah Tempat", "Semi-Militer, Pelindung, Medis",R.drawable.rhodesisland));
        elektronikArrayList.add(new Organisasi("Ursus", "Republik of Ursus", "Militer dan Bantuan Dana",R.drawable.ursus));
    }
}
