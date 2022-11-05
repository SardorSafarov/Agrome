package com.example.zamin.agrome.main.activity.drawerInActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zamin.agrome.databinding.ActivitySignUpBinding
import com.example.zamin.agrome.databinding.ActivitySupportBinding

class SupportActivity : AppCompatActivity() {
    lateinit var binding:ActivitySupportBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySupportBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}