package com.example.aight_music;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class message extends AppCompatActivity {

    private ViewGroup hiddenPanelShare;
    private ViewGroup hiddenPanelAdd;
    private boolean isPanelShown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_message);
        hiddenPanelShare = (ViewGroup)findViewById(R.id.hidden_panel_share);
        hiddenPanelAdd = (ViewGroup)findViewById(R.id.hidden_panel_add);
        hiddenPanelShare.setVisibility(View.INVISIBLE);
        hiddenPanelAdd.setVisibility(View.INVISIBLE);
        isPanelShown = false;

    }
    public void share (View share)
    {
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        hiddenPanelAdd.setVisibility(View.INVISIBLE);
        Animation bottomUp = AnimationUtils.loadAnimation(this.getBaseContext(),R.anim.bottom_up);
        ViewGroup hiddenPanelShare = (ViewGroup)findViewById(R.id.hidden_panel_share);
        hiddenPanelShare.startAnimation(bottomUp);
        hiddenPanelShare.setVisibility(View.VISIBLE);
    }

    public void add (View add)
    {
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        hiddenPanelShare.setVisibility(View.INVISIBLE);
        Animation bottomUp = AnimationUtils.loadAnimation(this.getBaseContext(),R.anim.bottom_up);
        ViewGroup hiddenPanelShare = (ViewGroup)findViewById(R.id.hidden_panel_add);
        hiddenPanelShare.startAnimation(bottomUp);
        hiddenPanelShare.setVisibility(View.VISIBLE);
    }


    public void doneAdd (View doneadd)
    {
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        hiddenPanelShare.setVisibility(View.INVISIBLE);
        Animation bottomDown = AnimationUtils.loadAnimation(this.getBaseContext(),R.anim.bottom_down);
        ViewGroup hiddenPanel = (ViewGroup)findViewById(R.id.hidden_panel_add);
        hiddenPanel.startAnimation(bottomDown);
        hiddenPanel.setVisibility(View.INVISIBLE);
    }

    public void doneShare (View doneshare)
    {
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        hiddenPanelAdd.setVisibility(View.INVISIBLE);
        Animation bottomDown = AnimationUtils.loadAnimation(this.getBaseContext(),R.anim.bottom_down);
        ViewGroup hiddenPanelShare = (ViewGroup)findViewById(R.id.hidden_panel_share);
        hiddenPanelShare.startAnimation(bottomDown);
        hiddenPanelShare.setVisibility(View.INVISIBLE);
    }

}