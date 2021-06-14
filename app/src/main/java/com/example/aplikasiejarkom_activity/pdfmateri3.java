package com.example.aplikasiejarkom_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfmateri3 extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfmateri3);

        pdfView= findViewById(R.id.pdfView);
        pdfView.fromAsset("materi3.pdf").load();
    }
}