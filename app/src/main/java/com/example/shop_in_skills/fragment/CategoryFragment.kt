package com.example.shop_in_skills.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.shop_in_skills.R

class category : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Variable for object

        var lifestyle=LifestyleFragment()
        var music_category=MusicFragment()
        var video=VideoFragment()
        var businessFrgment=BusinessFragment()
        var marketingFrgment=MarketingFragment()
        var graphicFrgment=GraphicsFragment()
        var writingFrgment=WritingFragment()

        // Variable for on click

        val writingTxt:TextView=view.findViewById(R.id.writing_id)
        val marketTxt:TextView=view.findViewById(R.id.marketing_id)
        val businessTxt:TextView=view.findViewById(R.id.business_id)
        val videoTxt:TextView=view.findViewById(R.id.video_id)
        val lifestyl: TextView =view.findViewById(R.id.lifestyle_id)
        val music:TextView=view.findViewById(R.id.music_id)
        val graphicTxt:TextView=view.findViewById(R.id.graphic_id)

        lifestyl.setOnClickListener(View.OnClickListener {
            replaceFragment(lifestyle)
        })

        music.setOnClickListener(View.OnClickListener {
            replaceFragment(music_category)
        })

        videoTxt.setOnClickListener(View.OnClickListener {
            replaceFragment(video)
        })

        businessTxt.setOnClickListener(View.OnClickListener {
            replaceFragment(businessFrgment)
        })

        marketTxt.setOnClickListener(View.OnClickListener {
            replaceFragment(marketingFrgment)
        })

        graphicTxt.setOnClickListener(View.OnClickListener {
            replaceFragment(graphicFrgment)
        })

        writingTxt.setOnClickListener(View.OnClickListener {
            replaceFragment(writingFrgment)
        })


    }

    private fun replaceFragment(fragment: Fragment)
    {
        if(fragment!=null)
        {
            val transaction =parentFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container,fragment)
            transaction.commit()
        }
    }

}