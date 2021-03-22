package com.example.seatinalpha.ui.account

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.seatinalpha.R

class AccountFragment : Fragment() {
    private lateinit var accountViewModel : AccountViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        accountViewModel = ViewModelProvider(this).get(AccountViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_account, container, false)
//
        val signOutButton : Button = root.findViewById(R.id.signOutButton)

        signOutButton.setOnClickListener {
            val toast = Toast.makeText(this.context, "Signed Out Successfully!", Toast.LENGTH_SHORT)
            toast.show()
        }

        return root
    }
}