package com.example.prince.multiscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.prince.multiscreen.Fragments.colorsFragment;

public class colors extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new colorsFragment())
                .commit();
    }
}
