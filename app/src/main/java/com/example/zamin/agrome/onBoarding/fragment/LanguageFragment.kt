package com.example.zamin.agrome.onBoarding.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.zamin.agrome.BaseFragment
import com.example.zamin.agrome.R
import com.example.zamin.agrome.databinding.FragmentLanguageBinding

class LanguageFragment(val listener: Listener) : BaseFragment<FragmentLanguageBinding>(FragmentLanguageBinding::inflate) {
    interface Listener {
        fun btnUzListener()
        fun btnRuListener()
        fun btnEnListener()
    }

    override fun onViewCreate() {
        binding.apply {
            btnUz.setOnClickListener {
                listener.btnUzListener()
            }

            btnEn.setOnClickListener {
                listener.btnEnListener()
            }

            btnRu.setOnClickListener {
                listener.btnRuListener()
            }
        }
    }

}