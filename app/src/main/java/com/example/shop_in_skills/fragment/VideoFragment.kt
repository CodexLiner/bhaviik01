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
 * Use the [VideoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class VideoFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_video, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Variable for object

        var videoEdit= VideoEditingFragment()
        var videoProduct = VideoProductFragment()
        var videoAnimated = VideoAnimatedFragment()

        val videoEdt = view.findViewById<TextView>(R.id.video_edit)
        videoEdt.setOnClickListener(View.OnClickListener {
            replaceFragment(videoEdit)
        })

        val videoPrdt = view.findViewById<TextView>(R.id.video_animated)
        videoPrdt.setOnClickListener(View.OnClickListener {
            replaceFragment(videoProduct)
        })

        val videoAnimt = view.findViewById<TextView>(R.id.video_product)
        videoAnimt.setOnClickListener(View.OnClickListener {
            replaceFragment(videoAnimated)
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