package com.example.shiori

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
class TabAdapter(fm:FragmentManager, private val context: Context): FragmentPagerAdapter(fm){

    override fun getItem(position: Int): Fragment {
        when(position){
            0 ->  { return Tab01Fragment() }
            1 ->  { return Tab02Fragment() }
            2 ->  { return Tab03Fragment() }
            3 ->  { return Tab04Fragment() }
            4 ->  { return Tab05Fragment() }
            5 ->  { return Tab06Fragment() }
            6 ->  { return Tab07Fragment() }
            else ->  { return Tab08Fragment() }



        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> { return "表紙" }
            1 ->  { return "ひと" }
            2 ->  { return "もちもの" }
            3 ->  { return "21日" }
            4 ->  { return "22日" }
            5 ->  { return "23日" }
            6 ->  { return "おみせ" }
            else ->  { return "ホテル" }
        }
    }

    override fun getCount(): Int {
        return 8
    }
}