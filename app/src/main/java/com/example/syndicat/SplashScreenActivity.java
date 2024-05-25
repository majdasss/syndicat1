package com.example.syndicat;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Initialize views
        ImageView logoImageView = findViewById(R.id.logo);
        ProgressBar progressBar = findViewById(R.id.progressBar2);

        // Load and start animation
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotatanim);
        logoImageView.startAnimation(animation);

        // Redirect to RegisterActivity after a delay
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreenActivity.this, register.class);
            startActivity(intent);
            finish();  // Finish SplashScreenActivity so the user can't return to it
        }, 8000);  // Delay in milliseconds
    }
}
