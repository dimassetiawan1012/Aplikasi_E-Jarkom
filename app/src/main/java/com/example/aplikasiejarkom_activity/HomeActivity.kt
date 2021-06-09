package com.example.aplikasiejarkom_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class HomeActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnIntent = findViewById(R.id.btn_tiga)

        btnIntent.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_tiga ->{
                val  Kuis = Intent(this@HomeActivity,KuisActivity::class.java)
                startActivity(Kuis)
            }
        }
    }
}