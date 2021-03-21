package com.example.seatinalpha.ui.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.seatinalpha.R

class FeedFragment : Fragment() {
    private lateinit var feedViewModel : FeedViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        feedViewModel = ViewModelProvider(this).get(FeedViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_feed, container, false)
//        val textView = root.findViewById(R.id.text_)

        return root
    }
}