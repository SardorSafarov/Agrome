package com.example.zamin.agrome.onBoarding.fragment

import com.example.zamin.agrome.BaseFragment
import com.example.zamin.agrome.databinding.FragmentFirstBinding
import java.util.EventListener


class FirstFragment(val listener: FirstBtn):BaseFragment<FragmentFirstBinding>(FragmentFirstBinding::inflate){
    interface FirstBtn{
        fun setOnClickListener1()
    }
    override fun onViewCreate() {
        binding.btn.setOnClickListener {
            listener.setOnClickListener1()
        }
    }

}