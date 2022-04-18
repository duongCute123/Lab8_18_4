package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class TaoTK extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taotk);
        Intent intent=new Intent(TaoTK.this,HoanThanh.class);
        setIntent(intent);
    }
}
