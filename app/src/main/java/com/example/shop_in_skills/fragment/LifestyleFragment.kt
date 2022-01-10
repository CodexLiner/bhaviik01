package com.example.shop_in_skills.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.shop_in_skills.R

class LifestyleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lifestyle, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var fashionAndBeauty=LifestyleFashionFragment()
        var blogging=LifestyleBloggingFragment()
        var fitness=LifestyleFitnessFragment()
        var travel=LifestyleTravelFragment()

        val fashion1 =view.findViewById<TextView>(R.id.fashion)
        fashion1.setOnClickListener(View.OnClickListener {
          replaceFragment(fashionAndBeauty)
        })

        val blog =view.findViewById<TextView>(R.id.blogging_and_social)
        blog.setOnClickListener(View.OnClickListener {
            replaceFragment(blogging)
        })

        val fit =view.findViewById<TextView>(R.id.fitness_life)
        fit.setOnClickListener(View.OnClickListener {
            replaceFragment(fitness)
        })

        val travl =view.findViewById<TextView>(R.id.travel_lifestyle)
        travl.setOnClickListener(View.OnClickListener {
            replaceFragment(travel)
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