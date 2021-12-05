package com.example.style_wanita;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.style_wanita.model.Pakaian;

import java.util.List;
public class DaftarPakaianActivity extends AppCompatActivity{
    public final static String HEWAN_TERPILIH ="hewan_obj_key";
    List<Pakaian> pakaians;
    ListView listView;
    String jenisPakaian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actifity_daftar_pakaian);
        Intent intent = getIntent();
        jenisPakaian = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        TextView txJudul = findViewById(R.id.text_title_daftar);
        txJudul.setText("DAFTAR BERBAGAI RAS "+jenisPakaian.toUpperCase());
        pakaians = DataProvider.getPakaiansByTipe(this,jenisPakaian);
        setupListView();
    }

    private void setupListView() {
        listView = findViewById(R.id.listview_daftar_hewan);
        DaftarPakaianAdapter adapter = new DaftarPakaianAdapter(this,pakaians);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onListClik);
    }
    private AdapterView.OnItemClickListener onListClik = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            Pakaian terpilih = pakaians.get(position);
            bukaProfilePakean(terpilih);
        }
    };
    private void bukaProfilePakean(Pakaian hewanTerpilih) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, ProfileAcrivity.class);
        intent.putExtra(HEWAN_TERPILIH, hewanTerpilih);
        startActivity(intent);
    }
}
