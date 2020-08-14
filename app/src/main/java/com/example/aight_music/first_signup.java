package com.example.aight_music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class first_signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_first_signup);
    }
    public void signIn (View signin)
    {
        startActivity(new Intent(first_signup.this,signIn.class));
    }

    public void signUpWithUs(View signupwithus)
    {
        startActivity(new Intent(first_signup.this,signUpWithUs.class));
    }
    public void signUpAuth (View signupauth)
    {
        startActivity(new Intent(first_signup.this,signUpAuthenticated.class));
    }
}
