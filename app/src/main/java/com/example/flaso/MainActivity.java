package com.example.flaso;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button BtnSearch;
    private Button AppleC;
    private Button SamsungC;
    private Button GoogleC;
    private Button AboutC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnSearch = findViewById(R.id.BtnSearch);
        BtnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSearch();
            }
        });

        AppleC = findViewById(R.id.Apple);
        AppleC.setOnClickListener(this);

        SamsungC = findViewById(R.id.Samsung);
        SamsungC.setOnClickListener(this);

        GoogleC = findViewById(R.id.Google);
        GoogleC.setOnClickListener(this);

        AboutC = findViewById(R.id.About);
        AboutC.setOnClickListener(this);


    }

    public void openSearch () {
        EditText nameField = (EditText) findViewById(R.id.search_bar);
        Editable nameEditable = nameField.getText();
        String query = nameEditable.toString();

        Intent intent = new Intent(this, ScndActivity.class);
        intent.putExtra("ID", query);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Apple:
                startActivity(new Intent(this, AppleActivity.class));
                break;

            case R.id.Samsung:
                startActivity(new Intent(this, SamsungActivity.class));
                break;

            case R.id.Google:
                startActivity(new Intent(this, GoogleActivity.class));
                break;

            case R.id.About:
                startActivity(new Intent(this, AboutActivity.class));
                break;
        }
    }




}