package com.itsxtt.myplaygrounds.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.itsxtt.myplaygrounds.bean.NavigationItem
import com.itsxtt.myplaygrounds.databinding.ItemNavigationBinding
import com.itsxtt.myplaygrounds.viewbinding.ViewBindingActivity

class NavigationAdapter(val navigationItems: List<NavigationItem>) : RecyclerView.Adapter<NavigationAdapter.ViewHolder>() {

    inner class ViewHolder(binding: ItemNavigationBinding) : RecyclerView.ViewHolder(binding.root) {
        val nameBtn = binding.nameBtn
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemNavigationBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val navigationItem = navigationItems[position]
        holder.nameBtn.text = navigationItem.name

        holder.nameBtn.setOnClickListener {
            holder.itemView.context.startActivity(Intent(holder.itemView.context, ViewBindingActivity::class.java))
        }
    }

    override fun getItemCount() = navigationItems.size
}