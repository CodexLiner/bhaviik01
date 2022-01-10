package com.example.shop_in_skills

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val mylist:ArrayList<Int>): RecyclerView.Adapter<Adapter.ViewHolder>()
{
    class ViewHolder(item : View):RecyclerView.ViewHolder(item){

        val image:ImageView=item.findViewById(R.id.page0recyl)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val vew= LayoutInflater.from(p0.context).inflate(R.layout.page0recycle,p0,false)
        return ViewHolder(vew)
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.image.setImageResource(mylist.get(p1))
    }

    override fun getItemCount(): Int {
        return mylist.size
    }
}