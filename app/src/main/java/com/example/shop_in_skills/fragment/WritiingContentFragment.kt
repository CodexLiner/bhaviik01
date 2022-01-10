package com.example.shop_in_skills.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.shop_in_skills.R


class WritiingContentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_writiing_content, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sophie=view.findViewById<TextView>(R.id.sophie_id)
        sophie.setOnClickListener(View.OnClickListener {

        })

        val los=view.findViewById<TextView>(R.id.los_id)
        los.setOnClickListener(View.OnClickListener {

        })

        val lemi=view.findViewById<TextView>(R.id.lemi_id)
        lemi.setOnClickListener(View.OnClickListener {

        })

    }
}