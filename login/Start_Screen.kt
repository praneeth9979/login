package com.example.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivityStartScreenBinding

class Start_Screen : AppCompatActivity() {
private val binding:ActivityStartScreenBinding by lazy {
    ActivityStartScreenBinding.inflate(layoutInflater)
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        binding.nextButtton.setOnClickListener {
            val intent = Intent(this,Login_Page::class.java)
            startActivity(intent)

        }

    }
}
