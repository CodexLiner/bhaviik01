package com.example.shop_in_skills

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.shop_in_skills.R.layout.*
import com.example.shop_in_skills.fragment.Home
import com.example.shop_in_skills.fragment.category
import com.example.shop_in_skills.fragment.inbox
import com.google.android.material.bottomnavigation.BottomNavigationView

class page1 : AppCompatActivity() {

    // For fragment
    private var bottomNavigation:BottomNavigationView?=null
    private  val homeFragment= Home()
    private  val profile= com.example.shop_in_skills.fragment.profile()
    private  val indx= inbox()
    private  val categoryFragment= category()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(activity_page1)

//        Fragment work
        replaceFragment(homeFragment)
        bottomNavigation=findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigation?.setOnNavigationItemSelectedListener{

          when(it.itemId)
          {

              R.id.Home->{ replaceFragment(homeFragment)}
              R.id.Search->{ replaceFragment(categoryFragment)}
              R.id.Inbox->{ replaceFragment(indx)}
              R.id.Profile->{ replaceFragment(profile)}
          };true
        }

    }
    private fun replaceFragment(fragment: Fragment)
    {
        if(fragment!=null)
        {
            val transaction =supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container,fragment)
            transaction.commit()
        }
    }
}