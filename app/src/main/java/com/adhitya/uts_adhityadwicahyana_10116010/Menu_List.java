package com.adhitya.uts_adhityadwicahyana_10116010;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Menu_List extends AppCompatActivity {
    public static String EXTRA_MESSAGE = "Adhitya Dwi Cahyana";
    public static String EXTRA_MSG = "dece";
    public static String EXTRA_Test = "dce";
    public static String test = "adhitya dwi cahyana";
    public static String test2 = "hilih";
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent menu_utama = new Intent(Menu_List.this, Menu_Utama.class);
                    startActivity(menu_utama);
                    finish();
                    return true;
                case R.id.navigation_dashboard:
                    Intent menu_kontak = new Intent(Menu_List.this, Menu_Kontak.class);
                    startActivity(menu_kontak);
                    finish();
                    return true;
                case R.id.navigation_notifications:
                    return true;
            }
            return false;
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__list);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    public void kirimData (View view){
        Intent menu_tambahteman = new Intent (Menu_List.this, menu_tambahteman.class);
        EditText nama = findViewById(R.id.nama);
        EditText kelas = findViewById(R.id.kelas);
        EditText telepon = findViewById(R.id.telepon);
        EditText email = findViewById(R.id.email);
        EditText sosmed = findViewById(R.id.sosmed);
        String msgnama = nama.getText().toString();
        String msgkelas = kelas.getText().toString();
        String msgtelepon = telepon.getText().toString();
        String msgemail = email.getText().toString();
        String msgsosmed = sosmed.getText().toString();
        menu_tambahteman.putExtra(EXTRA_MESSAGE, msgnama);
        menu_tambahteman.putExtra(EXTRA_MSG, msgkelas);
        menu_tambahteman.putExtra(EXTRA_Test, msgtelepon);
        menu_tambahteman.putExtra(test, msgemail);
        menu_tambahteman.putExtra(test2, msgsosmed);
        startActivity(menu_tambahteman);
    }

}
