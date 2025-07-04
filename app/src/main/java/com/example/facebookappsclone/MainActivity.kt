package com.example.facebookappsclone

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.facebookappsclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Click listener for the login button
        binding.buttonLogin.setOnClickListener {
            val emailOrPhone = binding.editTextEmail.text.toString() // Email or Phone input
            val pass = binding.editTextPassword.text.toString() // Password input

            // Check for the first set of credentials (Munia credentials)
            if ((emailOrPhone == "munia.amad-05-10@dipti.com.bd" || emailOrPhone == "01818426020") && pass == "Munia123") {
                // Navigate to WelcomeActivity for Ms. Munia
                val intent = Intent(this, WelcomeActivity::class.java)
                startActivity(intent)
                finish()
            }
            // Check for the second set of credentials (abc@email.com and 01714010150)
            else if ((emailOrPhone == "abc@email.com" || emailOrPhone == "01714010150") && pass == "1234") {
                // Navigate to DashboardActivity for the second set of credentials
                startActivity(Intent(this, DashboardActivity::class.java))
                finish()
            } else {
                // Display a message if credentials are incorrect
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
            }
        }

        // Click listener for the Create Account button
        binding.buttonCreateAccount.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}
