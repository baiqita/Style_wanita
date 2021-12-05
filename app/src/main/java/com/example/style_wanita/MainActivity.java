package com.example.style_wanita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
public class MainActivity extends AppCompatActivity {
    private Button biodata, mediasosial;
    ImageButton btnCelana,btnRok, btnBaju;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }
    private void inisialisasiView() {
        btnCelana = findViewById(R.id.btn_buka_model_celana);
        btnRok = findViewById(R.id.btn_buka_model_rok);
        btnBaju = findViewById(R.id.btn_buka_model_baju);
        btnBaju.setOnClickListener(view -> bukaGaleri("Baju"));
        btnCelana.setOnClickListener(view -> bukaGaleri("Celana"));
        btnRok.setOnClickListener(view -> bukaGaleri("Rok"));

    }

    private void bukaGaleri(String jenisPakaian) {
        Log.d("MAIN","Buka activity celana");
        Intent intent = new Intent(this, DaftarPakaianActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisPakaian);
        startActivity(intent);
    }
    public void PindahToBiodata(View v){
        Intent intent = new Intent(this, BiodataDiriActivity.class);
        startActivity(intent);
    }
}