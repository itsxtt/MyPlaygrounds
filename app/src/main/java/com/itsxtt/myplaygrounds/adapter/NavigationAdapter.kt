package com.itsxtt.myplaygrounds.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.itsxtt.myplaygrounds.bean.NavigationItem
import com.itsxtt.myplaygrounds.databinding.ItemNavigationBinding

class NavigationAdapter(val navigationItems: List<NavigationItem>) : RecyclerView.Adapter<NavigationAdapter.ViewHolder>() {

    var onClickListener: OnItemClickListener? = null

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
            onClickListener?.onClick(position, navigationItem)
        }
    }

    override fun getItemCount() = navigationItems.size

    interface OnItemClickListener {
        fun onClick(position: Int, item: NavigationItem)
    }
}