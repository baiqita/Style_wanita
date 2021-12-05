package com.example.style_wanita;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.style_wanita.model.Pakaian;
public class ProfileAcrivity extends AppCompatActivity{
    Pakaian pakaian;
    TextView txJudul, txJenis, txAsal, txDeskripsi;
    ImageView ivFotoHewan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilr_pakaian);
        Intent intent = getIntent();
        pakaian = (Pakaian) intent.getSerializableExtra(DaftarPakaianActivity.HEWAN_TERPILIH);
        inisialisasiView();
        tampilkanProfil(pakaian);
    }

    private void inisialisasiView() {
        txJudul = findViewById(R.id.txJudul);
        txJenis = findViewById(R.id.txJenis);
        txAsal = findViewById(R.id.txAsal);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoHewan = findViewById(R.id.gambarPakaian);
    }


    private void tampilkanProfil(Pakaian pakaian) {
        Log.d("Profil", "Menampilkan " + pakaian.getJenis());
        txJudul.setText(pakaian.getJenis());
        txJenis.setText(pakaian.getRas());
        txAsal.setText(pakaian.getAsal());
        txDeskripsi.setText(pakaian.getDeskripsi());
        ivFotoHewan.setImageDrawable(this.getDrawable(pakaian.getDrawableRes()));
    }

}
