package com.example.aplikasiejarkom_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class HomeActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent: Button
    private lateinit var btnIntent2: Button
    private lateinit var btnIntent3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnIntent = findViewById(R.id.btn_tiga)
        btnIntent2 = findViewById(R.id.btn_satu)
        btnIntent3 = findViewById(R.id.btn_dua)

        btnIntent.setOnClickListener(this)
        btnIntent2.setOnClickListener(this)
        btnIntent3.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_tiga -> {
                val Kuis = Intent(this@HomeActivity, KuisActivity::class.java)
                startActivity(Kuis)
            }
            R.id.btn_satu -> {
                val Pengenalan = Intent(this@HomeActivity, PengenalanActivity::class.java)
                startActivity(Pengenalan)
            }
            R.id.btn_dua -> {
                val Materi = Intent(this@HomeActivity, MateriActivity::class.java)
                startActivity(Materi)
            }
        }
    }
}
