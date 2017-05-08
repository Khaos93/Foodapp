package com.example.juanacastro.foodoclock.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.juanacastro.foodoclock.R;
import com.example.juanacastro.foodoclock.adapter.PictureAdapterRecyclerView;
import com.example.juanacastro.foodoclock.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {




    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ShowToolbar(getResources().getString(R.string.home), false, view);
        RecyclerView pictureRecycler = (RecyclerView) view.findViewById(R.id.pictureRecycler);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(linearLayoutManager.VERTICAL);

            pictureRecycler.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buidpicture(),R.layout.cardview_picture, getActivity());

        pictureRecycler.setAdapter(pictureAdapterRecyclerView);
        return view;
    }

    public ArrayList<Picture> buidpicture() {

        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("http://crepesywaffles.com.mx/sites/crepesywaffles.com.mx/files/slide/cw-la-roma-1_0.jpg","1.5 Km","Creps and Waffles","Parrila","105 Pts"));
        pictures.add(new Picture("https://media-cdn.tripadvisor.com/media/photo-s/03/8d/ee/cd/il-forno.jpg","3.5 Km","il forno","Pastas","115 Pts"));
        pictures.add(new Picture("https://3.bp.blogspot.com/-tZE5bp6cVNw/VuMLIY8jzvI/AAAAAAAAAAM/4kS9Trh_0vY4_5TckOWEE36QXP9fTkYtg/s1600/PROVINCIA.jpg","4.5 Km","La provincia","Carnes","125 Pts"));
        pictures.add(new Picture("http://www.eltiempo.com/contenido///colombia/boyaca-7-dias/IMAGEN/IMAGEN-16520388-2.png","5.5 Km","Juan Valdez","Cafes","135 Pts"));

        return pictures;
    }


    public void ShowToolbar(String title, boolean upButton, View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.Toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(title);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_profile);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


}