package com.example.flaso;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AppleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // Create a list of words
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Apple iPhone 11 Pro Max", R.drawable.ip11promax, "Screen: 6.5\", 1242x2688 pixels", "Camera: Triple 12 MP", "Memory: 4GB RAM", "Chipset: Apple A13 Bionic", "Battery: 3969mAh Li-Ion"));
        words.add(new Word("Apple iPhone 11 Pro ", R.drawable.ip11pro, "Screen: 5.8\", 1125x2436 pixels", "Camera: Triple 12 MP", "Memory: 4GB RAM", "Chipset: Apple A13 Bionic", "Battery: 3046mAh Li-Ion"));
        words.add(new Word("Apple iPhone 11 ", R.drawable.ip11, "Screen: 6.1\", 828x1792 pixels", "Camera: Dual 12 MP", "Memory: 4GB RAM", "Chipset: Apple A13 Bionic", "Battery: 3110mAh Li-Ion"));
        words.add(new Word("Apple iPhone X ", R.drawable.ipx, "Screen: 5.8\", 1125x2436 pixels", "Camera: Dual 12 MP", "Memory: 3GB RAM", "Chipset: Apple A11 Bionic", "Battery: 2716mAh Li-Ion"));
        words.add(new Word("Apple iPhone XR ", R.drawable.ipxr, "Screen: 6.1\", 828x1792 pixels", "Camera: Single 12 MP", "Memory: 3GB RAM", "Chipset: Apple A12 Bionic", "Battery: 2942mAh Li-Ion"));
        words.add(new Word("Apple iPad Air 2019 ", R.drawable.ipadair2019, "Screen: 10.5\", 1668x2224 pixels", "Camera: Single 8 MP", "Memory: 3GB RAM", "Chipset: Apple A12 Bionic", "Battery: 8134mAh Li-Po"));
        words.add(new Word("Apple iPad Pro 12.9 2018 \n ", R.drawable.ipadpro12, "Screen: 12.9\", 2048x2732 pixels", "Camera: Single 12 MP", "Memory: 4/6GB RAM", "Chipset: Apple A12X Bionic", "Battery: 9720mAh Li-Po"));

        WordAdapter adapter = new WordAdapter(this, words, R.color.backgroundCol);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
