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
 * Use the [WritingFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WritingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_writing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var contentFrgment=WritiingContentFragment()
        var magzineFrgment=WritingMagzineFragment()
        var pressFrgment=WritingPressFragment()
        var proofreaderFrgment=WritingProofreaderFragment()
        var authorFrgment=WritingAuthorFragment()

        val contentTxt=view.findViewById<TextView>(R.id.content_id)
        contentTxt.setOnClickListener(View.OnClickListener {
            replaceFragment(contentFrgment)
        })

        val magzineTxt = view.findViewById<TextView>(R.id.magzine_id)
        magzineTxt.setOnClickListener(View.OnClickListener {
            replaceFragment(magzineFrgment)
        })

        val pressTxt=view.findViewById<TextView>(R.id.press_id)
        pressTxt.setOnClickListener(View.OnClickListener {
            replaceFragment(pressFrgment)
        })

        val proofreaderTxt=view.findViewById<TextView>(R.id.proofreader_id)
        proofreaderTxt.setOnClickListener(View.OnClickListener {
            replaceFragment(proofreaderFrgment)
        })

        val authorTxt=view.findViewById<TextView>(R.id.author_id)
        authorTxt.setOnClickListener(View.OnClickListener {
            replaceFragment(authorFrgment)
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