package com.example.zamin.agrome.main.activity.drawerInActivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.zamin.agrome.databinding.ActivityForTheOfferBinding

class ForTheOfferActivity : AppCompatActivity() {
    lateinit var binding: ActivityForTheOfferBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForTheOfferBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}