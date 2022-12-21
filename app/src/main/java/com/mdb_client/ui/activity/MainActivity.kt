package com.mdb_client.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mdb_client.R
import com.mdb_client.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }
}