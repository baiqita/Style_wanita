package com.example.style_wanita;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.style_wanita.model.Pakaian;

import java.util.List;

public class DaftarPakaianAdapter extends ArrayAdapter<Pakaian>{
    Context context;

    public DaftarPakaianAdapter(Context context, List<Pakaian> pakaians) {
        super(context, R.layout.row_daftar_pakaian, pakaians);
        this.context = context;
    }

    private static class ViewHolder  {
        TextView textJenis;
        TextView textAsal;
        ImageView gambar;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Pakaian pakaian = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_daftar_pakaian, parent, false);
            viewHolder.textJenis =  convertView.findViewById(R.id.row_text_jenis);
            viewHolder.textAsal = (TextView) convertView.findViewById(R.id.row_text_asal);
            viewHolder.gambar = convertView.findViewById(R.id.row_image_pakaian);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.textJenis.setText(pakaian.getJenis());
        viewHolder.textAsal.setText(pakaian.getAsal());
        viewHolder.gambar.setImageDrawable(context.getDrawable(pakaian.getDrawableRes()));
        return convertView;
    }
}
