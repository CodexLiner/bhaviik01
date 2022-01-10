package com.example.shop_in_skills

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class Adapter1(val mylist1:ArrayList<Int>): RecyclerView.Adapter<Adapter1.ViewHolder>()
{

    class ViewHolder(item : View): RecyclerView.ViewHolder(item){

        val image: ImageView =item.findViewById(R.id.page1recyl)
    }

    override fun onCreateViewHolder(p01: ViewGroup, p2: Int): ViewHolder {
        val vew= LayoutInflater.from(p01.context).inflate(R.layout.page1recycle,p01,false)
        return ViewHolder(vew)
    }

    override fun onBindViewHolder(p01: ViewHolder, p2: Int) {
        p01.image.setImageResource(mylist1.get(p2))
    }
    override fun getItemCount(): Int {
        return mylist1.size
    }
}