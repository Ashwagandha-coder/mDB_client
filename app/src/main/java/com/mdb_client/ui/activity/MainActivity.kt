package com.mdb_client.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mdb_client.databinding.ActivityMainBinding
import com.mdb_client.ui.viewModels.CertificationsViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel = CertificationsViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //todo: Практика с okHttp

    }


    private fun action() {}
}