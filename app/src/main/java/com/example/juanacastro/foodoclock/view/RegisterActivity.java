package com.example.juanacastro.foodoclock.view;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.juanacastro.foodoclock.R;

public class RegisterActivity extends AppCompatActivity {

    private DrawerLayout drawer_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Register_toolbar(getResources().getString(R.string.title_toolbar),true);

    }


    public void Register_toolbar (String title, boolean upButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.Toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }


}
