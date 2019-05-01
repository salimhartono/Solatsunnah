package com.gharin.solatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
//        todo : deklarasi

    TextView tahajjud, witir, rawatib, dhuha, istikhoroh, tahiyyatul_masjid, sholat_syuruq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        todo : inisialisasi

        tahajjud = findViewById(R.id.tahajjud);
        witir = findViewById(R.id.witir);
        rawatib = findViewById(R.id.rawatib);
        dhuha = findViewById(R.id.dhuha);
        istikhoroh = findViewById(R.id.istikhoroh);
        tahiyyatul_masjid = findViewById(R.id.tahiyyatul_masjid);
        sholat_syuruq = findViewById(R.id.sholat_syuruq);

        tahajjud.setOnClickListener(this);
        witir.setOnClickListener(this);
        rawatib.setOnClickListener(this);
        dhuha.setOnClickListener(this);
        istikhoroh.setOnClickListener(this);
        tahiyyatul_masjid.setOnClickListener(this);
        sholat_syuruq.setOnClickListener(this);
    }
//      todo : setonclicklistener button
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tahajjud:
                Intent tahajjud = new Intent(MainActivity.this, Deskripsi.class);
                tahajjud.putExtra("sunnah", "https://wisatanabawi.com/sholat-tahajjud/");
                startActivity(tahajjud);
                break;

            case R.id.witir:
                Intent witir = new Intent(MainActivity.this, Deskripsi.class);
                witir.putExtra("sunnah", "https://bersamadakwah/sholat-witir/");
                startActivity(witir);
                break;

            case R.id.rawatib:
                Intent rawatib = new Intent(MainActivity.this, Deskripsi.class);
                rawatib.putExtra("sunnah", "https://muslim.or.id/4602-tuntunan-shalat-sunnah-rawatib.html");
                startActivity(rawatib);
                break;

            case R.id.dhuha:
                Intent dhuha = new Intent(MainActivity.this, Deskripsi.class);
                dhuha.putExtra("sunnah", "https://muslim.or.id/44198-fikih-shalat-dhuha.html");
                startActivity(dhuha);
                break;

            case R.id.istikhoroh:
                Intent istikhoroh = new Intent(MainActivity.this, Deskripsi.class);
                istikhoroh.putExtra("sunnah", "https://www.dream.co.id/orbit/tata-cara-shalat-istikharah-1811138.html");
                startActivity(istikhoroh);
                break;

            case R.id.tahiyyatul_masjid:
                Intent tahiyyatul_masjid = new Intent(MainActivity.this, Deskripsi.class);
                tahiyyatul_masjid.putExtra("sunnah", "https://muslim.or.id/18829-shalat-tahiyatul-masjid.html");
                startActivity(tahiyyatul_masjid);
                break;

            case R.id.sholat_syuruq:
                Intent sholat_syuruq = new Intent(MainActivity.this, Deskripsi.class);
                sholat_syuruq.putExtra("sholat_syuruq", "https://aitarus.com/sholat-syuruq-isyraq/");
                startActivity(sholat_syuruq);
                break;

        }
    }
}
