package com.example.juanacastro.foodoclock.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.juanacastro.foodoclock.R;
import com.example.juanacastro.foodoclock.model.Picture;
import com.example.juanacastro.foodoclock.view.ReservasActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by juan.a.castro on 14/11/2016.
 */
public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder>{

    private ArrayList<Picture> pictures;
    private int resource;
    private Activity activity;

    public PictureAdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }



    @Override
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PictureViewHolder holder, int position) {
        Picture picture = pictures.get(position);
        holder.Distancia.setText(picture.getDistancia());
        holder.Name_restaurant.setText(picture.getName_restaurant());
        holder.tipo_restaurante.setText(picture.getTipo_restaurante());
        holder.puntaje.setText(picture.getPuntaje());
        Picasso.with(activity).load(picture.getRpictureCard()).into(holder.RpictureCard);

        holder.RpictureCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, ReservasActivity.class);
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{

        private ImageView RpictureCard;
        private TextView Distancia;
        private TextView Name_restaurant;
        private TextView tipo_restaurante;
        private TextView puntaje;


        public PictureViewHolder(View itemView) {
            super(itemView);

            RpictureCard = (ImageView) itemView.findViewById(R.id.RpictureCard);
            Distancia = (TextView)  itemView.findViewById(R.id.Distancia);
            Name_restaurant = (TextView)  itemView.findViewById(R.id.Name_restaurant);
            tipo_restaurante = (TextView)  itemView.findViewById(R.id.tipo_restaurante);
            puntaje = (TextView)  itemView.findViewById(R.id.puntaje);

        }
    }
}
