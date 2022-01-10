package com.example.shop_in_skills.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.shop_in_skills.R


class GraphicLogoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_graphic_logo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val kanwar2=view.findViewById<TextView>(R.id.kanwar_id2)
        kanwar2.setOnClickListener(View.OnClickListener {

        })

        val merry=view.findViewById<TextView>(R.id.merry_id)
        merry.setOnClickListener(View.OnClickListener {

        })

        val maria=view.findViewById<TextView>(R.id.maria_id)
        maria.setOnClickListener(View.OnClickListener {

        })

        val megan=view.findViewById<TextView>(R.id.megan_id)
        megan.setOnClickListener(View.OnClickListener {

        })

        val rajni=view.findViewById<TextView>(R.id.rajal_id)
        rajni.setOnClickListener(View.OnClickListener {

        })

    }
}