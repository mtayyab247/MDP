package com.example.cvbuilder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.cvbuilder.adapters.CVBViewAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = CVBViewAdapter(supportFragmentManager,lifecycle)
        // Set the Adapter to your Viewpager UI

        val viewPager = findViewById<ViewPager2>(R.id.viewpager)
        viewPager.adapter = adapter
        /* Setting up Tab Layout with the ViewPageg2 is handled by the
       TabLayoutMediator
        * by passing your tablayout id and viewpager id*/
        val tabLayout = findViewById<TabLayout>(R.id.tlayaout)
        TabLayoutMediator(tabLayout,viewPager){tab,position->
            when(position){
                0->{
                    tab.text="HOME"
                }
                1->{
                    tab.text="ABOUT ME"
                }
                2->{
                    tab.text="WORK"
                }
                3->{
                    tab.text = "CONTACT"
                }
            }
        }.attach()

    }
}