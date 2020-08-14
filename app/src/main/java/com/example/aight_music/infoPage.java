package com.example.aight_music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class infoPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_info_page);
    }
    public void do_first_signup(View dofirstsignup)
    {
        startActivity(new Intent(infoPage.this,first_signup.class));
    }
}