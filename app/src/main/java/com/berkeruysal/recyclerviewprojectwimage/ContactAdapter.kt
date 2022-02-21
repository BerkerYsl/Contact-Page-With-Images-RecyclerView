package com.berkeruysal.recyclerviewprojectwimage

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_contact.view.*

class ContactAdapter(val context: Context, val contacts:List<Contact>) :
    RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
    private val TAG="ContactAdapter"
    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        fun bind(contact: Contact) {
            itemView.textViewPersonName.text=contact.name
            itemView.textViewPersonAge.text="Age: ${contact.age}"

            //Glide library ile remote olarak indirdiğimiz görselleri imageview içerisine atacağız
            Glide.with(context).load(contact.imageUrl).into(itemView.imageView2)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.i(TAG,"onCreateViewHolder")
        val view=LayoutInflater.from(context).inflate(R.layout.item_contact,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.i(TAG,"onBindViewHolder at position $position")
    val contact=contacts[position]
        holder.bind(contact)
    }

    override fun getItemCount(): Int {
        return contacts.size
    }
}