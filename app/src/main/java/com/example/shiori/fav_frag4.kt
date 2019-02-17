package com.example.shiori

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.app.Activity;
import android.graphics.Color;
import android.view.*
import android.view.View.OnClickListener;
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.airbnb.lottie.LottieAnimationView;
import kotlinx.android.synthetic.main.fragment_tab_4.*


    @SuppressLint("Registered")
    class fav_frag4 : AppCompatActivity() {

        // AnimationViewのクリック状態を保持するためのフィールドです。
        private var clickedFav = false

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.fragment_tab_4)

            animation_view.setOnClickListener(object : View.OnClickListener {
                override fun onClick(v : View?) {
                    if (clickedFav) {
                        // setProgress(0f)でアニメーション開始前状態にします。
                        animation_view.setProgress(0f);
                        clickedFav = false;
                    } else {
                        animation_view.playAnimation();
                        clickedFav = true;
                    }
                }
            })
        }


    }
