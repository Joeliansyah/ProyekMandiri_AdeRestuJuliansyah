package com.example.proyekmandiriaderestujuliansyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.TextSwitcher;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class LokasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lokasi);

        ImageSlider Slider1 = findViewById(R.id.koleksi1);
        List<SlideModel> slideModels1 = new ArrayList<>();
        slideModels1.add(new SlideModel(R.drawable.koleksigazelle1, ScaleTypes.FIT));
        slideModels1.add(new SlideModel(R.drawable.koleksigazelle2, ScaleTypes.FIT));
        slideModels1.add(new SlideModel(R.drawable.koleksigazelle3, ScaleTypes.FIT));
        slideModels1.add(new SlideModel(R.drawable.koleksigazelle4, ScaleTypes.FIT));
        slideModels1.add(new SlideModel(R.drawable.koleksigazelle5, ScaleTypes.FIT));
        slideModels1.add(new SlideModel(R.drawable.koleksigazelle6, ScaleTypes.FIT));
        slideModels1.add(new SlideModel(R.drawable.koleksigazelle7, ScaleTypes.FIT));
        slideModels1.add(new SlideModel(R.drawable.koleksigazelle8, ScaleTypes.FIT));
        slideModels1.add(new SlideModel(R.drawable.koleksigazelle9, ScaleTypes.FIT));
        slideModels1.add(new SlideModel(R.drawable.koleksigazelle10, ScaleTypes.FIT));
        Slider1.setImageList(slideModels1, ScaleTypes.FIT);

        ImageSlider Slider2 = findViewById(R.id.koleksi2);
        List<SlideModel> slideModels2 = new ArrayList<>();
        slideModels2.add(new SlideModel(R.drawable.koleksiretrograde1, ScaleTypes.FIT));
        slideModels2.add(new SlideModel(R.drawable.koleksiretrograde2, ScaleTypes.FIT));
        slideModels2.add(new SlideModel(R.drawable.koleksiretrograde3, ScaleTypes.FIT));
        slideModels2.add(new SlideModel(R.drawable.koleksiretrograde4, ScaleTypes.FIT));
        slideModels2.add(new SlideModel(R.drawable.koleksiretrograde5, ScaleTypes.FIT));
        slideModels2.add(new SlideModel(R.drawable.koleksiretrograde6, ScaleTypes.FIT));
        slideModels2.add(new SlideModel(R.drawable.koleksiretrograde7, ScaleTypes.FIT));
        slideModels2.add(new SlideModel(R.drawable.koleksiretrograde8, ScaleTypes.FIT));
        slideModels2.add(new SlideModel(R.drawable.koleksiretrograde9, ScaleTypes.FIT));
        slideModels2.add(new SlideModel(R.drawable.koleksiretrograde10, ScaleTypes.FIT));
        slideModels2.add(new SlideModel(R.drawable.koleksiretrograde11, ScaleTypes.FIT));
        slideModels2.add(new SlideModel(R.drawable.koleksiretrograde12, ScaleTypes.FIT));
        slideModels2.add(new SlideModel(R.drawable.koleksiretrograde13, ScaleTypes.FIT));
        Slider2.setImageList(slideModels2, ScaleTypes.FIT);

        ImageSlider Slider3 = findViewById(R.id.koleksi3);
        List<SlideModel> slideModels3 = new ArrayList<>();
        slideModels3.add(new SlideModel(R.drawable.koleksislipon1, ScaleTypes.FIT));
        slideModels3.add(new SlideModel(R.drawable.koleksislipon2, ScaleTypes.FIT));
        slideModels3.add(new SlideModel(R.drawable.koleksislipon3, ScaleTypes.FIT));
        slideModels3.add(new SlideModel(R.drawable.koleksislipon4, ScaleTypes.FIT));
        slideModels3.add(new SlideModel(R.drawable.koleksislipon5, ScaleTypes.FIT));
        slideModels3.add(new SlideModel(R.drawable.koleksislipon6, ScaleTypes.FIT));
        slideModels3.add(new SlideModel(R.drawable.koleksislipon7, ScaleTypes.FIT));
        Slider3.setImageList(slideModels3, ScaleTypes.FIT);

        ImageSlider Slider4 = findViewById(R.id.koleksi4);
        List<SlideModel> slideModels4 = new ArrayList<>();
        slideModels4.add(new SlideModel(R.drawable.koleksilinen1, ScaleTypes.FIT));
        slideModels4.add(new SlideModel(R.drawable.koleksilinen2, ScaleTypes.FIT));
        slideModels4.add(new SlideModel(R.drawable.koleksilinen3, ScaleTypes.FIT));
        slideModels4.add(new SlideModel(R.drawable.koleksilinen4, ScaleTypes.FIT));
        Slider4.setImageList(slideModels4, ScaleTypes.FIT);

        ImageSlider Slider5 = findViewById(R.id.koleksi5);
        List<SlideModel> slideModels5 = new ArrayList<>();
        slideModels5.add(new SlideModel(R.drawable.koleksiprotolite1, ScaleTypes.FIT));
        slideModels5.add(new SlideModel(R.drawable.koleksiprotolite2, ScaleTypes.FIT));
        slideModels5.add(new SlideModel(R.drawable.koleksiprotolite3, ScaleTypes.FIT));
        slideModels5.add(new SlideModel(R.drawable.koleksiprotolite4, ScaleTypes.FIT));
        Slider5.setImageList(slideModels5, ScaleTypes.FIT);
    }
}