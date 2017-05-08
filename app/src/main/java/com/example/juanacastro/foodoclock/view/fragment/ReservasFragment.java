package com.example.juanacastro.foodoclock.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.juanacastro.foodoclock.R;

    public class ReservasFragment extends Fragment {


        public ReservasFragment() {
            // Required empty public constructor
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.activity_reservas_fragment, container, false);
        }

    }