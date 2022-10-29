package com.example.zamin.agrome.onBoarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.zamin.agrome.databinding.ActivityOnBoardingBinding
import com.example.zamin.agrome.onBoarding.fragment.FirstFragment
import com.example.zamin.agrome.onBoarding.fragment.SecondFragment
import com.example.zamin.agrome.onBoarding.fragment.ThreeFragment

class OnBoardingActivity : AppCompatActivity(), FirstFragment.FirstBtn, SecondFragment.SecondBtn,
    ThreeFragment.ThreeBtn {
    lateinit var binding: ActivityOnBoardingBinding
    lateinit var adapterFragment: ViewPageAdapter
    private val items: ArrayList<Fragment> = arrayListOf(FirstFragment(this), SecondFragment(this),ThreeFragment(this))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
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
        
    }

    override fun onBackPressed() {
        if (binding.onboarding.currentItem == 0)
            super.onBackPressed()
        else
            binding.onboarding.currentItem--
    }

}