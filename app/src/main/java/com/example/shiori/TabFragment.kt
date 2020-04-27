package com.example.shiori

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.fragment_tab_4.*
import kotlinx.android.synthetic.main.fragment_tab_8.*

class Tab01Fragment: Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tab_1,container,false)
    }
}

class Tab02Fragment: Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tab_2,container,false)
    }
}

class Tab03Fragment: Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tab_3,container,false)
    }
}

class Tab04Fragment: Fragment(){
    //private var clickedFav = false
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        animation_view.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v : View?) {
//                if (clickedFav) {
//                    // setProgress(0f)でアニメーション開始前状態にします。
//                    animation_view.setProgress(0f);
//                    clickedFav = false;
//                } else {
//                    animation_view.playAnimation();
//                    clickedFav = true;
//                }
//            }
//        })
        return inflater.inflate(R.layout.fragment_tab_4,container,false)


    }
}

class Tab05Fragment: Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tab_5,container,false)
    }
}

class Tab06Fragment: Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tab_6,container,false)
    }
}

class Tab07Fragment: Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tab_7,container,false)
    }
}

class Tab08Fragment: Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tab_8,container,false)
    }

}


