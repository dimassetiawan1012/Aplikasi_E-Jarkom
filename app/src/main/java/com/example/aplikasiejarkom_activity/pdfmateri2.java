package com.example.aplikasiejarkom_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfmateri2 extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfmateri2);

        pdfView= findViewById(R.id.pdfView);
        pdfView.fromAsset("materi2.pdf").load();
    }
}