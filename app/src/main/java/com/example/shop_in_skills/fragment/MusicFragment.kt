package com.example.shop_in_skills.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.shop_in_skills.R

class MusicFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_music, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var musicProducers=MusicProducersFragment()
        var musicSingr=MusicSingerFragment()
        var musicMusician=MusicMusicianFragment()
        var musicPodcast1=MusicPodcastFragment()

        val musicComposer =view.findViewById<TextView>(R.id.producers_composer)
        musicComposer.setOnClickListener(View.OnClickListener {
            replaceFragment(musicProducers)
        })

        val musicVocalist =view.findViewById<TextView>(R.id.singerVocalist)
        musicVocalist.setOnClickListener(View.OnClickListener {
            replaceFragment(musicSingr)
        })

        val musicSession =view.findViewById<TextView>(R.id.musicianSession)
        musicSession.setOnClickListener(View.OnClickListener {
            replaceFragment(musicMusician)
        })

        val musicPodcast =view.findViewById<TextView>(R.id.podcast)
        musicPodcast.setOnClickListener(View.OnClickListener {
            replaceFragment(musicPodcast1)
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