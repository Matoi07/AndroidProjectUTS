package com.adhitya.uts_adhityadwicahyana_10116010;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class menu_tambahteman extends AppCompatActivity {
    public static String inf = "Adhitya dwi cahyana";
    public static String info = "Info";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_tambahteman);
        Intent menu_tambahteman = getIntent();
        String getNama = menu_tambahteman.getStringExtra(Menu_List.EXTRA_MESSAGE);
        String getKelas = menu_tambahteman.getStringExtra(Menu_List.EXTRA_MSG);
        String getTelepon = menu_tambahteman.getStringExtra(Menu_List.EXTRA_Test);
        String getEmail = menu_tambahteman.getStringExtra(Menu_List.test);
        String getSocmed = menu_tambahteman.getStringExtra(Menu_List.test2);
        TextView nama = findViewById(R.id.hasilNama);
        TextView kelas = findViewById(R.id.hasiKelas);
        TextView telepon = findViewById(R.id.hasilTelepon);
        TextView email = findViewById(R.id.hasilEmail);
        TextView socmed = findViewById(R.id.hasilSosmed);
        nama.setText("Nama : "+ getNama);
        kelas.setText("Kelas : "+getKelas);
        telepon.setText("Telepon : "+getTelepon);
        email.setText("E-Mail : "+getEmail);
        socmed.setText("Instagram : "+getSocmed);
    }
}
