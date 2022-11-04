package com.example.zamin.agrome.login.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zamin.agrome.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    lateinit var binding:ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}