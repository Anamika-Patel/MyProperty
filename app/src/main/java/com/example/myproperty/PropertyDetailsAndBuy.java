package com.example.myproperty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class PropertyDetailsAndBuy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_details_and_buy);
        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModel = new ArrayList<>();
        slideModel.add(new SlideModel("https://images.pexels.com/photos/106399/pexels-photo-106399.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940", "Duplex"));
        slideModel.add(new SlideModel("https://images.pexels.com/photos/1642125/pexels-photo-1642125.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500", "Duplex Area"));
        slideModel.add(new SlideModel("https://images.pexels.com/photos/3724312/pexels-photo-3724312.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","Kitchen"));
        slideModel.add(new SlideModel("https://images.pexels.com/photos/1571470/pexels-photo-1571470.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500", "Hall"));
        imageSlider.setImageList(slideModel, true);
    }
}