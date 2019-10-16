package com.gharin.solatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Deskripsi extends AppCompatActivity {
//      todo : deklarasi

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);
                getSupportActionBar().setDisplayShowHomeEnabled(true);


//        todo : inisialisasi

        webView = findViewById(R.id.webView);

        Intent deskripsi = getIntent();

        String link = deskripsi.getStringExtra("sunnah");

//        todo : Intent
            //agar javascript nya bisa terbaca
        webView.getSettings().getJavaScriptEnabled();
        // agar gambar nya automatis di masukkan
        webView.getSettings().setLoadsImagesAutomatically(true);
        //untuk memasukkan linknya
        webView.loadUrl(link);
    }
}
