package com.example.shop_in_skills.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.shop_in_skills.R


class inbox : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_inbox, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var addcoursFrgment=AddCourseFragment()
        var latestupdat=LatestUpdateFragment()
        var certificat=CertificateFragment()
        var help=HelpFragment()

        val addCourse=view.findViewById<TextView>(R.id.addCourse)

        addCourse.setOnClickListener(View.OnClickListener {
            replaceFragment(addcoursFrgment)

        })

        val latestUpdate=view.findViewById<TextView>(R.id.latestUpdate)

        latestUpdate.setOnClickListener(View.OnClickListener {
            replaceFragment(latestupdat)
        })

        val certificate=view.findViewById<TextView>(R.id.certificate)

        certificate.setOnClickListener(View.OnClickListener {
            replaceFragment(certificat)
        })

        val helpline=view.findViewById<TextView>(R.id.helpLine)

        helpline.setOnClickListener(View.OnClickListener {
            replaceFragment(help)
        })

    }
    private fun replaceFragment(fragment: Fragment){

        if(fragment!= null){
            val transaction=parentFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container,fragment)
            transaction.commit()
        }

    }
}