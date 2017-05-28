package br.com.diariodemame.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.diariodemame.R;

public class SplashActivity extends AppCompatActivity {

    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

            Handler handle = new Handler();
            handle.postDelayed(new Runnable() {
                @Override
                public void run() {
                    changeToAdd();
                }
            }, 2000);
    }

    private void changeToAdd() {
        startActivity(new Intent(SplashActivity.this, HomeActivity.class));
    }

}