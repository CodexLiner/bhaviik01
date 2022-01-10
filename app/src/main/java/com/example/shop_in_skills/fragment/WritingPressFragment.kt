package com.example.shop_in_skills.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.shop_in_skills.R


class WritingPressFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_writing_press, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val jane=view.findViewById<TextView>(R.id.jane_id)
        jane.setOnClickListener(View.OnClickListener {

        })

        val rophie=view.findViewById<TextView>(R.id.rophie_id)
        rophie.setOnClickListener(View.OnClickListener {

        })

        val soe2=view.findViewById<TextView>(R.id.soe_id)
        soe2.setOnClickListener(View.OnClickListener {

        })

        val rose=view.findViewById<TextView>(R.id.rose_id)
        rose.setOnClickListener(View.OnClickListener {

        })

    }
}