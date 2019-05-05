package com.example.faishalapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class Home extends AppCompatActivity implements View.OnClickListener {
    private CardView home,daily,gallery,watch,profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        home = (CardView) findViewById(R.id.home_id);
        daily = (CardView) findViewById(R.id.daily_id);
        gallery = (CardView) findViewById(R.id.gallery_id);
        watch = (CardView) findViewById(R.id.watch_id);
        profile = (CardView) findViewById(R.id.profile_id);
       //add click
        home.setOnClickListener(this);
        daily.setOnClickListener(this);
        gallery.setOnClickListener(this);
        watch.setOnClickListener(this);
        profile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()) {
            case R.id.home_id : i = new Intent(this,beranda.class);startActivity(i);break;
            case R.id.daily_id : i = new Intent(this,daily.class);startActivity(i);break;
            case R.id.gallery_id : i = new Intent(this,gallery.class);startActivity(i);break;
            case R.id.watch_id : i = new Intent(this,watch.class);startActivity(i);break;
            case R.id.profile_id : i = new Intent(this,profile.class);startActivity(i);break;
            default:break;
        }
    }

}
