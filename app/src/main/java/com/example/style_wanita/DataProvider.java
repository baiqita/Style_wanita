package com.example.style_wanita;

import android.content.Context;

import com.example.style_wanita.model.Pakaian;

import com.example.style_wanita.model.Baju;
import com.example.style_wanita.model.Celana;
import com.example.style_wanita.model.Rok;

import java.util.ArrayList;
import java.util.List;
public class DataProvider {
    private static List<Pakaian> pakaians = new ArrayList<>();

    private static List<Celana> initDataCelana(Context ctx) {
        List<Celana> celanas = new ArrayList<>();
        celanas.add(new Celana("Celana Jeans", "Batam",
                "Celana jeans ini terbuat dari bahan yang tidak mudah kusut dan nyaman dipakai", R.drawable.cjeans));
        celanas.add(new Celana("Celana Cargo Cewek", "Pekalongan",
                "Pada umumnya, pemilihan bahan celana cargo adalah dari jenis kain yang tebal dan juga kuat, karena celana ini cenderung digunakan untuk aktivitas outdoor.", R.drawable.ccargocewek));
        celanas.add(new Celana("Celana Jeans Cowok Pendek", "Indonesia",
                "Celana jeans pendek adalah jenis celana pendek favorit semua kalangan karena selain nyaman dikenakan modelnya juga simple sehingga cocok untuk dikenakan disegala aktivitas dirumah ataupun hanya untuk bersantai saja", R.drawable.cjeanscowokpendek));
        celanas.add(new Celana("Celana Kulot", "Jakarta",
                "Celana kulot merupakan salah satu jenis celana yang tidak lekang dimakan waktu model dan bahan celana kulot sampai saat ini, telah mengalami banyak perubahan yang cukup signifikan", R.drawable.ckulot));
        celanas.add(new Celana("Celana chinos pendek", "Sumbawa",
                "Celana chinos adalah sebuah kain yang terbuat dari katun atau khaki yang lembut dan halus tidak seperti jeans yang keras dan kaku", R.drawable.cpendekchinos));
        celanas.add(new Celana("Siberia", "Lombok",
                "Celana training merupakan celana super nyaman yang bisa dipakai untuk pelengkap penampilan saat berolahraga maupun untuk kegiatan lain yang bersifat casual ", R.drawable.ctraining));
        return celanas;
    }

    private static List<Rok> initDataRok(Context ctx) {
        List<Rok> roks = new ArrayList<>();
        roks.add(new Rok("Rok Tutu", "Surabaya",
                "Rok Tutu adalah rok yang dijahit dengan bahan transparan tipis dari kain sutra dan kain nilon ", R.drawable.rokjaring));
        roks.add(new Rok(" Rok Circle", "Medan ",
                "Rok circle adalah rok yang terbuat dari kain yang dilipat memanjang dengan potongan setengah lingkapan", R.drawable.rokcircle));
        roks.add(new Rok("Rok A-Line", "Sumatra",
                "Adalah rok sangat nyaman dipakai kemana saja, baik acara formal maupun sekedar untuk bermain keluar rumah ", R.drawable.rokaline));
        roks.add(new Rok("Rok Tiered", "malang",
                "Rok ini menampilkan motif bunga yang indah dan menampilkan warna-warna yang indah juga", R.drawable.roktiered));
        roks.add(new Rok("Rok Maxi", "Jakarta Pusat",
                "Rok wanita yang panjangnya sampai mata kaki bahkan sampai menyentuh lantai", R.drawable.rokmaxi));
        roks.add(new Rok("Rok Mini", "Mojokerto",
                "Jenis rok dengan batas jauh di atas lutut. Umumnya 15 cm atau lebih diatas lutut.", R.drawable.rokmini));
        return roks;
    }

    private static List<Baju> initDataBaju(Context ctx) {
        List<Baju> bajus = new ArrayList<>();
        bajus.add(new Baju("Baju Kaos Distro", "Yogyakarta",
                "Baju Kaos Distro baju kaos yang memilii ukuran lengan yang pendek dan nyaman untuk pergi kemana saja", R.drawable.bajukaos));
        bajus.add(new Baju("Baju Kemeja Pria Salur Lengan Pendek", "Medan ",
                "Baju casual semi formal nayama, berkualitas, dan memiliki motif garis.", R.drawable.bajukemejasalur));
        bajus.add(new Baju("Baju Remix", "Sumatra",
                "Baju remix adalah baju yang memiliki lengan panjang dan bahannya yang lembut cocok dipakai untuk anak muda sekarang, sangat pas dipakai saat aktivitas sehari-hari seperti pergi ke kampus.", R.drawable.bajuremix));
        bajus.add(new Baju("Baju Tunik", "malang",
                "Baju tunik yaitu pakaian longgar yang menutupi dada, berlengan atau tanpa lengan, dan panjangnya sampai dipinggung hingga sampai lutut.", R.drawable.bajutunik));
        bajus.add(new Baju("Baju Muslim Anak Cewek", "Jakarta Selatan",
                "Merupakan wujud atau representasi perkembangan fashion busana muslim di indonesia.", R.drawable.bajumuslimanak));
        bajus.add(new Baju("Atasan Blouse", "Palembang",
                "Baju Atasan Blouse adalah baju dengan model bagian atas longgar dan bagian bawahnya menggantung. Ukuran panjang blouse hanya sampai pinggang saja. ", R.drawable.bajublous));
        return bajus;
    }


    private static void initAllPakaians(Context ctx) {
        pakaians.addAll(initDataCelana(ctx));
        pakaians.addAll(initDataRok(ctx));
        pakaians.addAll(initDataBaju(ctx));

    }

    public static List<Pakaian> getAllPakaians(Context ctx) {
        if (pakaians.size() == 0) {
            initAllPakaians(ctx);
        }
        return pakaians;
    }

    public static List<Pakaian> getPakaiansByTipe(Context ctx, String jenis) {
        List<Pakaian> pakaiansByType = new ArrayList<>();
        if (pakaians.size() == 0) {
            initAllPakaians(ctx);
        }
        for (Pakaian h : pakaians) {
            if (h.getJenis().equals(jenis)) {
                pakaiansByType.add(h);
            }
        }
        return pakaiansByType;
    }
}
