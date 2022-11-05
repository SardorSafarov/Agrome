package com.example.zamin.agrome.main.activity.drawerInActivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.zamin.agrome.databinding.ActivityForTheOfferBinding

class ForTheOfferLinkActivity : AppCompatActivity() {
    lateinit var binding: ActivityForTheOfferBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForTheOfferBinding.inflate(layoutInflater)
        setContentView(binding.root)
        back()
    }

    private fun back() {
        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}