package com.example.aplikasiejarkom_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class PengenalanActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent5: Button
    private lateinit var btnIntent6: Button
    private lateinit var btnIntent7: Button
    private lateinit var btnIntent8: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengenalan)

        btnIntent5 = findViewById(R.id.btntangcrimping)
        btnIntent6 = findViewById(R.id.btnlantester)
        btnIntent7 = findViewById(R.id.btnrouter)
        btnIntent8 = findViewById(R.id.btnkabelrj45)


        btnIntent5.setOnClickListener(this)
        btnIntent6.setOnClickListener(this)
        btnIntent7.setOnClickListener(this)
        btnIntent8.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btntangcrimping -> {
                val TangCrimping = Intent(this@PengenalanActivity, pdftangcrimping::class.java)
                startActivity(TangCrimping)
            }
            R.id.btnlantester -> {
                val LanTester = Intent(this@PengenalanActivity, pdflantester::class.java)
                startActivity(LanTester)
            }
            R.id.btnrouter -> {
                val Router = Intent(this@PengenalanActivity, pdfrouter::class.java)
                startActivity(Router)
            }
            R.id.btnkabelrj45 -> {
                val KabelRJ45 = Intent(this@PengenalanActivity, pdfkabelrj45::class.java)
                startActivity(KabelRJ45)
            }
        }
    }
}
