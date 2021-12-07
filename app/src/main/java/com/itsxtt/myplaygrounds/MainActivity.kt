package com.itsxtt.myplaygrounds

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.alibaba.android.arouter.launcher.ARouter
import com.itsxtt.myplaygrounds.adapter.NavigationAdapter
import com.itsxtt.myplaygrounds.base.BaseActivity
import com.itsxtt.myplaygrounds.bean.NavigationItem
import com.itsxtt.myplaygrounds.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.navigationRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val adapter = NavigationAdapter(listOf(NavigationItem("ViewBinding", "")))
        binding.navigationRecyclerView.adapter = adapter
        adapter.onClickListener = object : NavigationAdapter.OnItemClickListener {
            override fun onClick(position: Int, item: NavigationItem) {

            }
        }
    }
}