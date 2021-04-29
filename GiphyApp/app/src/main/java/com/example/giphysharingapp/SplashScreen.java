package com.example.giphysharingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {

    private LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        initViews();
    }

    private void initViews() {
        lottieAnimationView = findViewById(R.id.lottieAnime);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Intent intent = new Intent(SplashScreen.this,MainActivity.class);
        startActivity(intent);
        finish();
        return true;
    }
}