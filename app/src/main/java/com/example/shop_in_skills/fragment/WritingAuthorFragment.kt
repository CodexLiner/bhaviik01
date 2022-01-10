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
 * Use the [WritingAuthorFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WritingAuthorFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_writing_author, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val soe=view.findViewById<TextView>(R.id.soe_id2)
        soe.setOnClickListener(View.OnClickListener {

        })

        val lemi2=view.findViewById<TextView>(R.id.lemi_id2)
        lemi2.setOnClickListener(View.OnClickListener {

        })

        val saze=view.findViewById<TextView>(R.id.saze_id2)
        saze.setOnClickListener(View.OnClickListener {

        })

        val eroth=view.findViewById<TextView>(R.id.eroth_id2)
        eroth.setOnClickListener(View.OnClickListener {

        })

    }
}