package com.rahardwika.resepmasakan;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by rahardwika on 5 Okt 2017.
 */

public class detailactivity extends AppCompatActivity{
    TextView resep;
    ImageView detailGambar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resepfull);
        Intent intent = getIntent();
        getSupportActionBar().setTitle(intent.getStringExtra("resep.masakan"));
        resep = (TextView)findViewById(R.id.resep);
        detailGambar = (ImageView)findViewById(R.id.detailgambar);

        resep.setText(intent.getStringExtra("resep.carabuat"));
        detailGambar.setImageResource(intent.getIntExtra("resep.gambar",0));
    }
}
