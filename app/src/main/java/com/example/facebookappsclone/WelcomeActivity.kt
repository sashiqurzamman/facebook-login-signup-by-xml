package com.example.facebookappsclone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.facebookappsclone.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set the welcome message
        binding.textWelcome.text = "Welcome Ms. Munia. Best wishes"
    }
}
