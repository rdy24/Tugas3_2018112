package com.example.healthnews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

  @SuppressLint("RestrictedApi")
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
}