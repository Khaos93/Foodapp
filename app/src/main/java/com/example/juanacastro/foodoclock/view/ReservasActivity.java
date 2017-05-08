package com.example.juanacastro.foodoclock.view;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.juanacastro.foodoclock.R;
import com.example.juanacastro.foodoclock.view.fragment.ComentFragment;
import com.example.juanacastro.foodoclock.view.fragment.InfoFragment;
import com.example.juanacastro.foodoclock.view.fragment.ReservasFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class ReservasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservas);
        //ShowToolbar_reservas("g",true);


        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottombar_restaurante);
        bottomBar.setDefaultTab(R.id.info);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                 switch (tabId) {

                    case R.id.info:
                        InfoFragment infoFragment = new InfoFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container_Reserva, infoFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
                        break;
                    case R.id.reservas:
                        ReservasFragment reservasFragment = new ReservasFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container_Reserva, reservasFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
                        ;
                        break;
                    case R.id.coment:
                        ComentFragment comentFragment = new ComentFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container_Reserva, comentFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
                        ;
                        break;
                }
            }
        });
    }

    public void ShowToolbar_reservas (String title, boolean upButton) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.Toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
        //CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingtoolbar);
    }
}
