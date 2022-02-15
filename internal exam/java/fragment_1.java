package com.example.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class fragment_1 extends Fragment {
    TextView text;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_2);

        text = (TextView)findViewById(R.id.text);

        Intent intent = getIntent();
        String str1 = intent.getStringExtra("message");
        String str2 = intent.getStringExtra("message");

        text.setText(str1);
        text.setText(str2);

    }