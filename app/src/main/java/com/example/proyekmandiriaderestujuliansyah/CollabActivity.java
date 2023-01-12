package com.example.proyekmandiriaderestujuliansyah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class CollabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collab);

        ImageSlider Slider1 = findViewById(R.id.collab1);
        List<SlideModel> slideModels1 = new ArrayList<>();
        slideModels1.add(new SlideModel(R.drawable.slidercollab1, ScaleTypes.FIT));
        slideModels1.add(new SlideModel(R.drawable.slidercollab2, ScaleTypes.FIT));
        slideModels1.add(new SlideModel(R.drawable.slidercollab3, ScaleTypes.FIT));
        Slider1.setImageList(slideModels1, ScaleTypes.FIT);

        ImageSlider Slider2 = findViewById(R.id.collab2);
        List<SlideModel> slideModels2 = new ArrayList<>();
        slideModels2.add(new SlideModel(R.drawable.slidercollabb, ScaleTypes.FIT));
        slideModels2.add(new SlideModel(R.drawable.slidercollabb2, ScaleTypes.FIT));
        slideModels2.add(new SlideModel(R.drawable.slidercollabb3, ScaleTypes.FIT));
        slideModels2.add(new SlideModel(R.drawable.slidercollabb4, ScaleTypes.FIT));
        Slider2.setImageList(slideModels2, ScaleTypes.FIT);

        ImageSlider Slider3 = findViewById(R.id.collab3);
        List<SlideModel> slideModels3 = new ArrayList<>();
        slideModels3.add(new SlideModel(R.drawable.collabbb1, ScaleTypes.FIT));
        slideModels3.add(new SlideModel(R.drawable.collabbb2, ScaleTypes.FIT));
        slideModels3.add(new SlideModel(R.drawable.collabbb3, ScaleTypes.FIT));
        Slider3.setImageList(slideModels3, ScaleTypes.FIT);
    }
}