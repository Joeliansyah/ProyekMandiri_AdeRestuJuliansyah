package com.example.proyekmandiriaderestujuliansyah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class dashboard extends AppCompatActivity {
    CardView cvAdd1,cvAdd2,cvAdd3,cvAdd4,cvAdd5,cvAdd6;
    Animation animasi;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        cvAdd1 = (CardView) findViewById(R.id.cvAdd1);
        cvAdd2 = (CardView) findViewById(R.id.cvAdd2);
        cvAdd3 = (CardView) findViewById(R.id.cvAdd3);
        cvAdd4 = (CardView) findViewById(R.id.cvAdd4);
        cvAdd5 = (CardView) findViewById(R.id.cvAdd5);
        cvAdd6 = (CardView) findViewById(R.id.cvAdd6);

        cvAdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add1 = new Intent(dashboard.this,SejarahActivity.class);
                startActivity(add1);
            }
        });

        cvAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add2 = new Intent(dashboard.this,VisiActivity.class);
                startActivity(add2);
            }
        });

        cvAdd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add3 = new Intent(dashboard.this,PerjalananActivity.class);
                startActivity(add3);
            }
        });

        cvAdd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add4 = new Intent(dashboard.this,CollabActivity.class);
                startActivity(add4);
            }
        });

        cvAdd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add5 = new Intent(dashboard.this,LokasiActivity.class);
                startActivity(add5);
            }
        });

        cvAdd6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add6 = new Intent(dashboard.this,ContactActivity.class);
                startActivity(add6);
            }
        });

        logo = findViewById(R.id.profile_photo);
        animasi();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            }
        },1000);
    }

    private void animasi(){
        animasi = AnimationUtils.loadAnimation(this,R.anim.splash_animasi);
        logo.startAnimation(animasi);
    }
}

