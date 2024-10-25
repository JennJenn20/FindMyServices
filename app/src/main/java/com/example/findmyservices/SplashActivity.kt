package com.example.findmyservices

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Delay for 3 seconds before moving to MainActivity
        Handler(Looper.getMainLooper()).postDelayed({
            // Start MainActivity after splash screen
            startActivity(Intent(this, MainActivity::class.java))
            // Close SplashActivity so that it's removed from the back stack
            finish()
        }, 3000)  // 3000 milliseconds = 3 seconds
    }
}
