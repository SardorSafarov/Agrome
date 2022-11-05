package com.example.zamin.agrome.main.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.zamin.agrome.BaseFragment
import com.example.zamin.agrome.R
import com.example.zamin.agrome.databinding.FragmentMainBinding


class MainFragment(val listener: DrawerBtnSetOnClickListener) : BaseFragment<FragmentMainBinding>(FragmentMainBinding::inflate){
    interface DrawerBtnSetOnClickListener{
        fun drawerBtnListener()
    }
    override fun onViewCreate() {
        binding.drawerBtn.setOnClickListener {
            listener.drawerBtnListener()
        }
    }

}