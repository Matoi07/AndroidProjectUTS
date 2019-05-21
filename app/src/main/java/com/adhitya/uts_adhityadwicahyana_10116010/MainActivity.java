package com.adhitya.uts_adhityadwicahyana_10116010;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int waktu_loading = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent viewpage = new Intent(MainActivity.this, viewpage.class);
                startActivity(viewpage);
                finish();
            }
        },waktu_loading);
    }
}
