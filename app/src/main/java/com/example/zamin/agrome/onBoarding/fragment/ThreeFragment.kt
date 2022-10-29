package com.example.zamin.agrome.onBoarding.fragment


import com.example.zamin.agrome.BaseFragment
import com.example.zamin.agrome.databinding.FragmentThreeBinding


class ThreeFragment(val listener:ThreeBtn) : BaseFragment<FragmentThreeBinding>(FragmentThreeBinding::inflate) {

    interface ThreeBtn{
        fun setOnClickListener3()
    }
    override fun onViewCreate() {
        binding.btn.setOnClickListener {
            listener.setOnClickListener3()
        }
    }

}