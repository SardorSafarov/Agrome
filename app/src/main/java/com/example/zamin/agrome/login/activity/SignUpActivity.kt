package com.example.zamin.agrome.login.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zamin.agrome.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding:ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}