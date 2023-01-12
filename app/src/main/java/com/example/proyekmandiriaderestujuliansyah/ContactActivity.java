package com.example.proyekmandiriaderestujuliansyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ContactActivity extends AppCompatActivity {

    ImageButton wa,ig,yt,fb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        wa = findViewById(R.id.btnWa);
        ig = findViewById(R.id.btnIg);
        yt = findViewById(R.id.btnYt);
        fb = findViewById(R.id.btnFb);

        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = ("https://api.whatsapp.com/send/?phone=6281398589993&text&type=phone_number&app_absent=0");
                Intent bukaWa = new Intent(Intent.ACTION_VIEW);
                bukaWa.setData(Uri.parse(url));
                startActivity(bukaWa);
            }
        });

        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = ("https://www.instagram.com/sepatucompass/");
                Intent bukaIg = new Intent(Intent.ACTION_VIEW);
                bukaIg.setData(Uri.parse(url));
                startActivity(bukaIg);
            }
        });

        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = ("https://www.youtube.com/channel/UCjeDs7AZg1ZgFBbIvhdCoww");
                Intent bukaYt = new Intent(Intent.ACTION_VIEW);
                bukaYt.setData(Uri.parse(url));
                startActivity(bukaYt);
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = ("https://www.facebook.com/groups/temancompassofficial");
                Intent bukaFb = new Intent(Intent.ACTION_VIEW);
                bukaFb.setData(Uri.parse(url));
                startActivity(bukaFb);
            }
        });
    }

}