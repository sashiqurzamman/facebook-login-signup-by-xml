package com.example.facebookappsclone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.facebookappsclone.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textWelcome.text = "Welcome to Facebook Clone!"
    }
}
