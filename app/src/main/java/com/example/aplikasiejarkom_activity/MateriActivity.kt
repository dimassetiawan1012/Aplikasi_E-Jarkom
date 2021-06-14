package com.example.aplikasiejarkom_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MateriActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent9: Button
    private lateinit var btnIntent10: Button
    private lateinit var btnIntent11: Button
    private lateinit var btnIntent12: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi)

        btnIntent9 = findViewById(R.id.btnmateri1)
        btnIntent10 = findViewById(R.id.btnmateri2)
        btnIntent11 = findViewById(R.id.btnmateri3)
        btnIntent12 = findViewById(R.id.btnmateri4)


        btnIntent9.setOnClickListener(this)
        btnIntent10.setOnClickListener(this)
        btnIntent11.setOnClickListener(this)
        btnIntent12.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnmateri1 -> {
                val Materi1 = Intent(this@MateriActivity, pdfmateri1::class.java)
                startActivity(Materi1)
            }
            R.id.btnmateri2 -> {
                val Materi2 = Intent(this@MateriActivity, pdfmateri2::class.java)
                startActivity(Materi2)
            }
            R.id.btnmateri3 -> {
                val Materi3 = Intent(this@MateriActivity, pdfmateri3::class.java)
                startActivity(Materi3)
            }
            R.id.btnmateri4 -> {
                val Materi4 = Intent(this@MateriActivity, pdfmateri4::class.java)
                startActivity(Materi4)
            }
        }
    }
}
