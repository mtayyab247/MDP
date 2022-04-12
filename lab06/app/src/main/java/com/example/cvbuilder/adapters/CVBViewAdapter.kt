package com.example.cvbuilder.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.cvbuilder.About
import com.example.cvbuilder.Contact
import com.example.cvbuilder.Home
import com.example.cvbuilder.Work

class CVBViewAdapter (fm: FragmentManager, lc: Lifecycle) :
FragmentStateAdapter(fm,lc) {
    // How many Fragments - Returns the total number of items in the data
//set held by the adapter.
    override fun getItemCount(): Int = 4
    // Provide a new Fragment associated with the specified position.
    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> Home()
            1-> About()
            2-> Work()
            3-> Contact()
            else-> Fragment()
        }
    }
}