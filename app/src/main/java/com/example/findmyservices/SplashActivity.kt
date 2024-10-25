package com.example.findmyservices

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Log.d("SplashActivity", "Splash screen displayed")

        // Delay for 3 seconds before moving to LoginActivity
        Handler(Looper.getMainLooper()).postDelayed({
            Log.d("SplashActivity", "Navigating to LoginActivity")

            // Start LoginActivity after splash screen
            startActivity(Intent(this, LoginActivity::class.java))

            // Close SplashActivity so it’s removed from the back stack
            finish()
        }, 3000) // 3000 milliseconds = 3 seconds
    }
}




