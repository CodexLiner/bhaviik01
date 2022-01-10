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
 * Use the [MarketingFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MarketingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_marketing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Variable for object
        var marketSearch = MarketingSearchFragment()
        var marketSocial = MarketingSocialFragment()
        var marketInfluence = MarketingInfluenceFragment()
        var marketContent = MarketingContentFragment()

        val marketSrch = view.findViewById<TextView>(R.id.searchEngine)
        marketSrch.setOnClickListener(View.OnClickListener {
            replaceFragment(marketSearch)
        })

        val marketSocil = view.findViewById<TextView>(R.id.socialMedia)
        marketSocil.setOnClickListener(View.OnClickListener {
            replaceFragment(marketSocial)
        })

        val marketCnt = view.findViewById<TextView>(R.id.contentWriting)
        marketCnt.setOnClickListener(View.OnClickListener {
            replaceFragment(marketContent)
        })

        val marketinfluncr = view.findViewById<TextView>(R.id.influencer)
        marketinfluncr.setOnClickListener(View.OnClickListener {
            replaceFragment(marketInfluence)
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