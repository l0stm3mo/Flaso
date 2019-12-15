package com.example.flaso;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SamsungActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // Create a list of words
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Samsung Galaxy Fold 5G", R.drawable.galaxyfold5g, "Screen: 7.3\", 1536x2152 pixels", "Camera: Triple 12 MP, 12 MP, 16 MP", "Memory: 12GB RAM", "Chipset: Qualcomm SDM855 Snapdragon 855", "Battery: 4235mAh Li-Po"));
        words.add(new Word("Samsung Galaxy Note10 Plus", R.drawable.note10plus, "Screen: 6.8\", 1440x3040 pixels", "Camera: Quad 12 MP, 12 MP, 16 MP, TOF 3D", "Memory: 12GB RAM", "Chipset: Exynos 9825/Qualcomm SDM855 Snapdragon 855", "Battery: 4300mAh Li-Ion"));
        words.add(new Word("Samsung Galaxy Note10", R.drawable.note10, "Screen: 6.3\", 1080x2280 pixels", "Camera: Triple 12 MP, 12 MP, 16 MP", "Memory: 12GB RAM", "Chipset: Exynos 9825/Qualcomm SDM855 Snapdragon 855", "Battery: 3500mAh Li-Ion"));
        words.add(new Word("Samsung Galaxy S10 Plus", R.drawable.s10plus, "Screen: 6.4\", 1440x3040 pixels", "Camera: Triple 12 MP, 12 MP, 16 MP", "Memory: 8/12GB RAM", "Chipset: Exynos 9820/Qualcomm SDM855 Snapdragon 855", "Battery: 4100mAh Li-Ion"));
        words.add(new Word("Samsung Galaxy S10", R.drawable.s10, "Screen: 6.1\", 1440x3040 pixels", "Camera: Triple 12 MP, 12 MP, 16 MP", "Memory: 8GB RAM", "Chipset: Exynos 9820/Qualcomm SDM855 Snapdragon 855", "Battery: 3400mAh Li-Ion"));
        words.add(new Word("Samsung Galaxy S10e", R.drawable.s10e, "Screen: 5.8\", 1080x2280 pixels", "Camera: Dual 12 MP, 16 MP", "Memory: 6/8GB RAM", "Chipset: Exynos 9820/Qualcomm SDM855 Snapdragon 855", "Battery: 3100mAh Li-Ion"));
        words.add(new Word("Samsung Galaxy A90 ", R.drawable.a905g, "Screen: 6.7\", 1080x2400 pixels", "Camera: Triple 48 MP, 8 MP, 5 MP", "Memory: 6/8GB RAM", "Chipset: Qualcomm SDM855 Snapdragon 855", "Battery: 4500mAh Li-Po"));


        WordAdapter adapter = new WordAdapter(this, words, R.color.backgroundCol);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

