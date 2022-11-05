package com.example.zamin.agrome.main.activity


import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.zamin.agrome.R
import com.example.zamin.agrome.databinding.ActivityMainBinding
import com.example.zamin.agrome.extensions.D
import com.example.zamin.agrome.main.activity.drawerInActivity.ForTheOfferActivity
import com.example.zamin.agrome.main.activity.drawerInActivity.ProposalOrComplaintActivity
import com.example.zamin.agrome.main.activity.drawerInActivity.SupportActivity
import com.example.zamin.agrome.main.fragments.ChatFragment
import com.example.zamin.agrome.main.fragments.MainFragment
import com.example.zamin.agrome.main.fragments.NewFragment
import com.example.zamin.agrome.main.fragments.ServicesFragment
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener,
    MainFragment.DrawerBtnSetOnClickListener {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.navDrawer.setNavigationItemSelectedListener(this)
        navigationBottomViewListener()
    }

    private fun navigationBottomViewListener() {
        supportFragmentManager.beginTransaction().replace(
            R.id.nav_host_fragment_activity_main,
            MainFragment(this)
        ).commit()
        binding.navBottomView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.btn_main -> {
                    supportFragmentManager.beginTransaction().replace(
                        R.id.nav_host_fragment_activity_main,
                        MainFragment(this)
                    ).commit()
                    true
                }
                R.id.btn_service -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.nav_host_fragment_activity_main,
                            ServicesFragment()
                        ).commit()
                    true
                }
                R.id.btn_new -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.nav_host_fragment_activity_main,
                            NewFragment()
                        ).commit()
                    true
                }
                R.id.btn_chat -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.nav_host_fragment_activity_main,
                            ChatFragment()
                        ).commit()
                    true
                }
                R.id.btn_menyu -> {
//                    supportFragmentManager.beginTransaction().replace(
//                        R.id.nav_host_fragment_activity_main,
//                        Kuproqq()
//                    ).commit()
                    true
                }
                else -> true
            }
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.btn_proposal_or_complaint -> {
                  startActivity(Intent(this, ProposalOrComplaintActivity::class.java))
            }
            R.id.btn_for_offer -> {
                startActivity(Intent(this, ForTheOfferActivity::class.java))
            }
            R.id.btn_support -> {
               startActivity(Intent(this, SupportActivity::class.java))
            }
            R.id.chap_menu_sozlanma -> {
             //   startActivity(Intent(this, Sozlanmalar::class.java))
            }
            R.id.chap_menu_offerta -> {
              //  startActivity(Intent(this, Offerta::class.java))
            }
//            R.id.chap_menu_boglanish ->{
//                startActivity(Intent(this,Boglanish::class.java))
//            }

            R.id.chap_menu_ilova_ulashish -> {
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT,
                    "Ishlab chiqaruvchi Sardor Safarov \nMurojat uchun tel:+99899 505 66 98");
                intent.type = "text/plain"
                startActivity(intent)
            }
        }
        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun drawerBtnListener() {
        binding.drawerLayout.openDrawer(GravityCompat.START)
    }

}