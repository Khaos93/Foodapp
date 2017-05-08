package com.example.juanacastro.foodoclock.view;

import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.juanacastro.foodoclock.R;



public class ProfileActivity extends AppCompatActivity {

    private DrawerLayout drawer_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        drawer_toolbar(getResources().getString(R.string.title_toolbar),true);
        drawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);

    }


    public void drawer_toolbar (String title, boolean upButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.Toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch(item.getItemId()) {

            case android.R.id.home:

                drawer_layout.openDrawer(GravityCompat.START);

                return true;

        }

        return super.onOptionsItemSelected(item);
    }
}
