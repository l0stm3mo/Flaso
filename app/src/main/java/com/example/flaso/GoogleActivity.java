package com.example.flaso;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GoogleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // Create a list of words
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Google Pixel C", R.drawable.pixelc, "Screen: 10.2\", 2560x1800 pixels", "Camera: Single 8MP", "Memory: 3GB RAM", "Chipset: Nvidia Tegra X1", "Battery: 9240mAh Li-Po"));
        words.add(new Word("Google Pixel 4 ", R.drawable.pixel4, "Screen: 5.7\", 1080x2280 pixels", "Camera: Dual 12.2 MP & 16 MP", "Memory: 6GB RAM", "Chipset: Qualcomm SDM855 Snapdragon 855", "Battery: 2800mAh Li-Po"));
        words.add(new Word("Google Pixel 3a ", R.drawable.pixel3a, "Screen: 5.6\", 1080x2220 pixels", "Camera: Single 12.2 MP", "Memory: 4GB RAM", "Chipset: Qualcomm SDM670 Snapdragon 670", "Battery: 3000mAh Li-Po"));
        words.add(new Word("Google Pixel 3 XL ", R.drawable.pixel3xl, "Screen: 6.3\", 1440x2960 pixels", "Camera: Single 12.2 MP", "Memory: 4GB RAM", "Chipset: Qualcomm SDM845 Snapdragon 845", "Battery: 3430mAh Li-Po"));
        words.add(new Word("Google Pixel 3", R.drawable.pixel3, "Screen: 5.5\", 1080x2160 pixels", "Camera: Single 12.2 MP", "Memory: 4GB RAM", "Chipset: Qualcomm SDM845 Snapdragon 845", "Battery: 2915mAh Li-Po"));
        words.add(new Word("Google Pixel 2 XL ", R.drawable.pixel2, "Screen: 6.0\", 1440x2880 pixels", "Camera: Single 12.2 MP", "Memory: 4GB RAM", "Chipset: Qualcomm MSM8998 Snapdragon 835", "Battery: 3520mAh Li-Ion"));


        WordAdapter adapter = new WordAdapter(this, words, R.color.backgroundCol);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

