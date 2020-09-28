package com.example.aight_music;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class home extends AppCompatActivity {

    MeowBottomNavigation meow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        meow = (MeowBottomNavigation) findViewById(R.id.bottom_nav);
        meow.add(new MeowBottomNavigation.Model(1,R.drawable.trending));
        meow.add(new MeowBottomNavigation.Model(2,R.drawable.message));
        meow.add(new MeowBottomNavigation.Model(3,R.drawable.playlist));
        meow.add(new MeowBottomNavigation.Model(4,R.drawable.profile));

    }
}