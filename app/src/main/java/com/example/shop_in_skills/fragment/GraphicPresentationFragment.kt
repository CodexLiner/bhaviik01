package com.example.shop_in_skills.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.shop_in_skills.R


class GraphicPresentationFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_graphic_presentation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dhriti=view.findViewById<TextView>(R.id.dhriti_id)
        dhriti.setOnClickListener(View.OnClickListener {

        })

        val james=view.findViewById<TextView>(R.id.james_id)
        james.setOnClickListener(View.OnClickListener {

        })

        val shahid=view.findViewById<TextView>(R.id.shahid_id)
        shahid.setOnClickListener(View.OnClickListener {

        })

        val suzan=view.findViewById<TextView>(R.id.suzan_id)
        suzan.setOnClickListener(View.OnClickListener {

        })

    }
}