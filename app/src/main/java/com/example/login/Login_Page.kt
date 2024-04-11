package com.example.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivityLoginPageBinding


class Login_Page : AppCompatActivity() {
    private val binding:ActivityLoginPageBinding by lazy {
        ActivityLoginPageBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.accountlogin.setOnClickListener {
            val intent = Intent(this,Signup_Activity::class.java)
            startActivity(intent)
        }
        binding.newaccountbutton.setOnClickListener {
            val intent = Intent(this, Signup_Activity::class.java)
            startActivity(intent)
        }

        }
    }
