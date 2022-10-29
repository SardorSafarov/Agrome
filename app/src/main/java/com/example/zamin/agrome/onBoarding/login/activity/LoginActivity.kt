package com.example.zamin.agrome.onBoarding.login.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zamin.agrome.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}