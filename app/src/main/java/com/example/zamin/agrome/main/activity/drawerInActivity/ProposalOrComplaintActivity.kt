package com.example.zamin.agrome.main.activity.drawerInActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zamin.agrome.databinding.ActivityProposalOrComplaintBinding

class ProposalOrComplaintActivity : AppCompatActivity() {
    lateinit var binding:ActivityProposalOrComplaintBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProposalOrComplaintBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}