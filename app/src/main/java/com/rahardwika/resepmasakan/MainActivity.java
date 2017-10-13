package com.rahardwika.resepmasakan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<resepMasakan> resepList = new ArrayList<>();

    RecyclerView r1;
    AdapterMakanan adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = (RecyclerView)findViewById(R.id.myRecycler);
        adapter = new AdapterMakanan(this,resepList);
        r1.setLayoutManager(new LinearLayoutManager(this));
        r1.setAdapter(adapter);

        isidata();
}

    private void isidata() {
    resepMasakan aku = new resepMasakan("Orak arik Kentang dan Daging","Variasi dari Orak Arik tradisional","Bahan:\n" +
            "2 buah kentang, kupas, parut kasar, tiriskan\n" +
            "100 g daging sapi giling\n" +
            "1 buah paprika merah, buang bijinya, potong dadu 1 cm\n" +
            "¼ sdt garam\n" +
            "¼ sdt merica putih bubuk\n" +
            "3 butir telur ayam, kocok\n" +
            "1 sdm Blue Band Serba Guna untuk menumis kentang\n" +
            "1 sdm Blue Band Serba Guna untuk menumis daging\n" +
            "\n" +
            "Langkah Penyajian\n" +
            "\n" +
            "1Panaskan 1 sdm Blue Band Serba Guna di dalam wajan di atas api sedang. Masukkan kentang, masak hingga setengah matang. Taburi dengan garam dan merica, aduk rata. Masak hingga kentang matang. Angkat, sisihkan.\n" +
            "2Dengan menggunakan wajan yang sama, panaskan 1 sdm Blue Band Serba Guna. Masukkan daging giling dan paprika, masak hingga airnya habis. Tuangkan telur, masak orak arik.\n" +
            "3 Masukkan kentang yang telah dimasak. Aduk rata. Angkat.\n" +
            "4Tata di atas piring saji. Hias dengan daun peterseli atau daun bawang.\n" +
            "Informasi Nilai Gizi Per Porsi\n\n",R.drawable.mobil);
        resepList.add(aku);
    }
}
