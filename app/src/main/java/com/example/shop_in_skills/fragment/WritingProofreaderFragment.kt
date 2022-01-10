package com.example.shop_in_skills.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.shop_in_skills.R

class WritingProofreaderFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_writing_proofreader, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val delie=view.findViewById<TextView>(R.id.delie_id)
        delie.setOnClickListener(View.OnClickListener {

        })

        val las=view.findViewById<TextView>(R.id.las_id)
        las.setOnClickListener(View.OnClickListener {

        })

        val devi=view.findViewById<TextView>(R.id.devi_id)
        devi.setOnClickListener(View.OnClickListener {

        })

        val phine=view.findViewById<TextView>(R.id.phine_id)
        phine.setOnClickListener(View.OnClickListener {

        })

    }
}