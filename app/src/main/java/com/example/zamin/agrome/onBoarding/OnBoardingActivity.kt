package com.example.zamin.agrome.onBoarding

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.zamin.agrome.databinding.ActivityOnBoardingBinding
import com.example.zamin.agrome.localDb.SharedPerferenceHelper
import com.example.zamin.agrome.onBoarding.fragment.FirstFragment
import com.example.zamin.agrome.onBoarding.fragment.LanguageFragment
import com.example.zamin.agrome.onBoarding.fragment.SecondFragment
import com.example.zamin.agrome.onBoarding.fragment.ThreeFragment
import com.example.zamin.agrome.login.activity.LoginActivity

class OnBoardingActivity : AppCompatActivity(), FirstFragment.FirstBtn, SecondFragment.SecondBtn,
    ThreeFragment.ThreeBtn, LanguageFragment.Listener {
    lateinit var binding: ActivityOnBoardingBinding
    lateinit var adapterFragment: ViewPageAdapter
    lateinit var sharedPreferences: SharedPerferenceHelper
    private val items: ArrayList<Fragment> = arrayListOf(LanguageFragment(this),FirstFragment(this), SecondFragment(this),ThreeFragment(this))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences = SharedPerferenceHelper(this)
        adapterFragment = ViewPageAdapter(items, this)
        binding.onboarding.adapter = adapterFragment
    }
    override fun setOnClickListener1() {
       binding.onboarding.currentItem++
    }

    override fun setOnClickListener2() {
        binding.onboarding.currentItem++
    }

    override fun setOnClickListener3() {
        sharedPreferences.setOnboarding("done")
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }

    override fun onBackPressed() {
        if (binding.onboarding.currentItem == 1)
            super.onBackPressed()
        else
            binding.onboarding.currentItem--
    }

    override fun btnUzListener() {
        binding.onboarding.currentItem++
    }

    override fun btnRuListener() {
        binding.onboarding.currentItem++
    }

    override fun btnEnListener() {
        binding.onboarding.currentItem++
    }

}