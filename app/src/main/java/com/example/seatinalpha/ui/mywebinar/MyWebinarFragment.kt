package com.example.seatinalpha.ui.mywebinar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.seatinalpha.R

class MyWebinarFragment : Fragment() {
    private lateinit var myWebinarViewModel : MyWebinarViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        myWebinarViewModel = ViewModelProvider(this).get(MyWebinarViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_my_webinar, container, false)
//        val textView = root.findViewById(R.id.text_)

        return root
    }
}

