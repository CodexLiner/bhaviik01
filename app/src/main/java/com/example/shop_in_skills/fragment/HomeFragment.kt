package com.example.shop_in_skills.fragment

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shop_in_skills.Adapter1
import com.example.shop_in_skills.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Home : Fragment() {

    private lateinit var recycleView1: RecyclerView
    private var imageId1=ArrayList<Int>(3)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<FloatingActionButton>(R.id.popbutton)
        button.setOnClickListener(View.OnClickListener {
            val dialog = AlertDialog.Builder(view.context)
            dialog.setView(R.layout.popup)
            dialog.setCancelable(true)
            dialog.show()
        })

        imageId1.add(R.drawable.recyclerpage1pic1)
        imageId1.add(R.drawable.recyclerpage1pic2)

        recycleView1 = view.findViewById(R.id.recycle1)

        recycleView1.adapter = Adapter1(imageId1)

        val lm = LinearLayoutManager(view.context, RecyclerView.HORIZONTAL, false)
        recycleView1.layoutManager = lm
        recycleView1.scrollToPosition(2)

//        val mainHandler = Handler(Looper.getMainLooper())
//        mainHandler.post(object : Runnable {
//            override fun run() {
//
//                if (lm.findFirstCompletelyVisibleItemPosition() < Adapter1.view.getItemCount)
//                {
//                    lm.smoothScrollToPosition( recycleView1, RecyclerView.State() , lm.findLastVisibleItemPosition() + 1)
//                }else if(lm.findFirstCompletelyVisibleItemPosition() == Adapter1.getItemCount() - 1){
//                     layoutManager.smoothScrollToPosition(view.context,recycleView1 , RecyclerView.State() , 0)
//                    recycleView1.scrollToPosition( 0)
//                }
//                mainHandler.postDelayed(this, 10000 )
//            }
//        })

    }

}