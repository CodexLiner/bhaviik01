package com.example.shop_in_skills.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.shop_in_skills.R

class GraphicFashionFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_graphic_fashion, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val alexender2 = view.findViewById<TextView>(R.id.alexender_id2)
        alexender2.setOnClickListener(View.OnClickListener {

        })

        val alice = view.findViewById<TextView>(R.id.alice_id)
        alice.setOnClickListener(View.OnClickListener {

        })

        val claudia2 = view.findViewById<TextView>(R.id.claudia_id2)
        claudia2.setOnClickListener(View.OnClickListener {

        })

        val crystal = view.findViewById<TextView>(R.id.crystal_id)
        crystal.setOnClickListener(View.OnClickListener {

        })

    }
}