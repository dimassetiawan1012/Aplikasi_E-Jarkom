package com.example.aplikasiejarkom_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfrouter extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfrouter);

        pdfView= findViewById(R.id.pdfView);
        pdfView.fromAsset("router.pdf").load();
    }
}