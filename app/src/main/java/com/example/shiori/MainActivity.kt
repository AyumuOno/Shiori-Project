package com.example.shiori

import android.os.Bundle


import android.app.Activity;
import android.app.TimePickerDialog
import android.content.Intent
import android.graphics.Color;
import android.net.Uri
import android.view.*

import android.view.View.OnClickListener;
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.airbnb.lottie.LottieAnimationView;


import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_tab_3.*
import kotlinx.android.synthetic.main.fragment_tab_4.*
import kotlinx.android.synthetic.main.fragment_tab_6.*
import kotlinx.android.synthetic.main.fragment_tab_8.*
import java.util.*

class MainActivity : AppCompatActivity(){

    // AnimationViewのクリック状態を保持するためのフィールドです。

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pager.adapter = TabAdapter(supportFragmentManager, this)
        tab_layout.setupWithViewPager(pager)



    }

}

