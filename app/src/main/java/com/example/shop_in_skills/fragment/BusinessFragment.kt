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
 * Use the [BusinessFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BusinessFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_business, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var businessAdviser=BusinessAdviserFragment()
        var businessReal=BusinessRealFragment()
        var businessRetail=BusinessRetailFragment()
        var businessVisiting=BusinessVisitingFragment()

        val business_adviser =view.findViewById<TextView>(R.id.business_adv)
        business_adviser.setOnClickListener(View.OnClickListener {
            replaceFragment(businessAdviser)
        })

        val businessEst =view.findViewById<TextView>(R.id.business_est)
        businessEst.setOnClickListener(View.OnClickListener {
            replaceFragment(businessReal)
        })

        val businessExp =view.findViewById<TextView>(R.id.business_exp)
        businessExp.setOnClickListener(View.OnClickListener {
            replaceFragment(businessRetail)
        })

        val businessCrd =view.findViewById<TextView>(R.id.business_crd)
        businessCrd.setOnClickListener(View.OnClickListener {
            replaceFragment(businessVisiting)
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