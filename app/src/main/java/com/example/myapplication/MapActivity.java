package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;


public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        GeoLocation geLoc = new GeoLocation();
        configureButton();
    }

    private void configureButton() {
        ImageButton buttonReview = findViewById(R.id.button_mainActivity);
        ImageButton buttonQrScanner = findViewById(R.id.button_QrScannerActivity);

        buttonReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MapActivity.this, MainActivity.class));
            }
        });

        buttonQrScanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MapActivity.this, QrScannerActivity.class));
            }
        });
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

    }
}