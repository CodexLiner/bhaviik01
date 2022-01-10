package com.example.shop_in_skills

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class page0 : AppCompatActivity() {
    private lateinit var recycleView: RecyclerView
    private var imageId=ArrayList<Int>(3)

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page0)
        imageId.add(R.drawable.png_20220102_140750_0000)
        imageId.add(R.drawable.png_20220102_141156_0000)
        imageId.add(R.drawable.png_20220102_141328_0000)

        val adapt=Adapter(imageId)
        recycleView=findViewById(R.id.recyclepage0)

        recycleView.adapter = Adapter(imageId)
        val lm= LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        recycleView.layoutManager=lm


        val mainHandler = Handler(Looper.getMainLooper())
        mainHandler.post(object : Runnable {
            override fun run() {
                if (lm.findFirstCompletelyVisibleItemPosition() < adapt.itemCount){
                    lm.smoothScrollToPosition( recycleView, RecyclerView.State() , lm.findLastVisibleItemPosition() + 1)
                }else if(lm.findFirstCompletelyVisibleItemPosition() == adapt.itemCount -1){
                    lm.smoothScrollToPosition( recycleView , RecyclerView.State() , 0)
                    recycleView.scrollToPosition( 0)
                }
                mainHandler.postDelayed(this, 10000 )
            }
        })
        Handler().postDelayed({
            val intent=Intent(this,page1::class.java)
            startActivity(intent)
            finishAffinity()
        },5000)
    }
}