package com.example.zamin.agrome.onBoarding.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.zamin.agrome.BaseFragment
import com.example.zamin.agrome.R
import com.example.zamin.agrome.databinding.FragmentSecondBinding


class SecondFragment(val listener:SecondBtn) : BaseFragment<FragmentSecondBinding>(FragmentSecondBinding::inflate) {
    interface SecondBtn{
        fun setOnClickListener2()
    }
    override fun onViewCreate() {
        binding.btn.setOnClickListener {
            listener.setOnClickListener2()
        }
    }

}