package com.tasnim.chowdhury.hiltnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.tasnim.chowdhury.hiltnotification.databinding.ActivityMainBinding
import com.tasnim.chowdhury.hiltnotification.viewModel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity() : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.simpleNotification.setOnClickListener {
            mainViewModel.showSimpleNotification()
        }

        binding.updateNotification.setOnClickListener {
            mainViewModel.updateNotification()
        }

        binding.cancelNotification.setOnClickListener {
            mainViewModel.cancelNotification()
        }
    }
}