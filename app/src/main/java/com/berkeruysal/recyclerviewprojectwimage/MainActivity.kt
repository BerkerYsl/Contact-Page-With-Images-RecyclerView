package com.berkeruysal.recyclerviewprojectwimage

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val contacts=createContact()
        val recyclerViewAdapter=ContactAdapter(this,contacts)
        recyclerView.adapter=recyclerViewAdapter
        recyclerView.layoutManager=LinearLayoutManager(this)
    }

    private fun createContact():List<Contact> {
        val contacts= mutableListOf<Contact>()
        for (i in 1..150)
            contacts.add(Contact("Person #$i",i))
            return contacts

    }
}