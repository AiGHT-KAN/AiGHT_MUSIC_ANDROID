package com.example.aight_music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.ncorti.slidetoact.SlideToActView;

public class signUpAuthenticated extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_sign_up_authenticated);
        SlideToActView sta = (SlideToActView) findViewById(R.id.ex);
        sta.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
            @Override
            public void onSlideComplete(SlideToActView slideToActView) {
                startActivity(new Intent(signUpAuthenticated.this,home.class));
                finish();
            }
        });
    }
}