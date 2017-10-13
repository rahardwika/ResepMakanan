package com.rahardwika.resepmasakan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rahardwika on 5 Okt 2017.
 */

public class AdapterMakanan extends RecyclerView.Adapter<AdapterMakanan.Holder> {

    private Context ctx;
    private List<resepMasakan> resepMasakanList;

    public AdapterMakanan(Context ct, List<resepMasakan> resep){
        this.ctx = ct;
        this.resepMasakanList = resep;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listresep, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        final resepMasakan data = resepMasakanList.get(position);
        holder.judul.setText(data.getNamaMasakan());
        holder.desc.setText(data.getDesc());
        holder.img.setImageResource(data.getImg());
        holder.judul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(ctx, detailactivity.class);
                it.putExtra("resep.masakan",data.getNamaMasakan());
                it.putExtra("resep.carabuat", data.getCaraMasak());
                it.putExtra("resep.gambar", data.getImg());
                ctx.startActivity(it);
            }
        });
    }

    @Override
    public int getItemCount() {
        return resepMasakanList.size();
    }

    public class Holder extends RecyclerView.ViewHolder{
        TextView judul, desc;
        ImageView img;

        public Holder(View itemView) {
            super(itemView);
            judul = (TextView)itemView.findViewById(R.id.judul);
            desc = (TextView)itemView.findViewById(R.id.deskripsi);
            img = (ImageView) itemView.findViewById(R.id.imageview);
        }
    }
}
