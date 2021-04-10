package com.kagu.warehouse2cocoba.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kagu.warehouse2cocoba.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnUser.setOnClickListener {
            Intent(this@MainActivity, WarehouseActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}