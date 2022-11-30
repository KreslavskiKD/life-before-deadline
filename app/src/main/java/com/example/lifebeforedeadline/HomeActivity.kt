package com.example.lifebeforedeadline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lifebeforedeadline.databinding.HomeActivityBinding

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = HomeActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.activityToolbar)
        handleClicks(binding)
    }

    private fun handleClicks(binding: HomeActivityBinding) {
        binding.calendarViewSample.setOnClickListener {
            startActivity(Intent(this, CalendarViewActivity::class.java))
        }
    }
}