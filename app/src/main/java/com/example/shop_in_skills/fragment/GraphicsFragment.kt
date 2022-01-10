package com.example.shop_in_skills.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.shop_in_skills.R

class GraphicsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_graphics, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var webFrgment=GraphicWebFragment()
        var logoFrgment=GraphicLogoFragment()
        var fashionFrgment=GraphicFashionFragment()
        var presentationFrgment=GraphicPresentationFragment()

        // Variable for on click

        val webTxt=view.findViewById<TextView>(R.id.web_id)
        webTxt.setOnClickListener(View.OnClickListener {
            replaceFragment(webFrgment)
        })

        val logoTxt=view.findViewById<TextView>(R.id.logo_id)
        logoTxt.setOnClickListener(View.OnClickListener {
            replaceFragment(logoFrgment)
        })

        val presentationTxt=view.findViewById<TextView>(R.id.presentation_id)
        presentationTxt.setOnClickListener(View.OnClickListener {
            replaceFragment(presentationFrgment)
        })

        val fashionTxt=view.findViewById<TextView>(R.id.fashion_id)
        fashionTxt.setOnClickListener(View.OnClickListener {
            replaceFragment(fashionFrgment)
        })

    }

    private fun replaceFragment(fragment:Fragment)
    {
        if(fragment!=null) {
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}