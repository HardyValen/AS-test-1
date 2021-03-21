package com.example.seatinalpha.ui.mywebinar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyWebinarViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is My Webinar Fragment"
    }

    val text: LiveData<String> = _text
}