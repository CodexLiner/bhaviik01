package com.example.shop_in_skills.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.shop_in_skills.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [WritingMagzineFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WritingMagzineFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_writing_magzine, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val noah=view.findViewById<TextView>(R.id.noah_id)
        noah.setOnClickListener(View.OnClickListener {

        })

        val herman=view.findViewById<TextView>(R.id.herman_id)
        herman.setOnClickListener(View.OnClickListener {

        })

        val hermanron=view.findViewById<TextView>(R.id.hermanron_id)
        hermanron.setOnClickListener(View.OnClickListener {

        })

    }
}