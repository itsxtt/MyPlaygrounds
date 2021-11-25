package com.itsxtt.myplaygrounds.viewbinding

import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.itsxtt.myplaygrounds.R
import com.itsxtt.myplaygrounds.base.BaseActivity
import com.itsxtt.myplaygrounds.databinding.ActivityViewBindingBinding

class ViewBindingActivity : BaseActivity() {

    private lateinit var binding: ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBindingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.root.setBackgroundColor(ContextCompat.getColor(this, R.color.teal_200))
        binding.titleTV.text = "Hello, ViewBinding"
        binding.button.text = "OK"

        binding.button.setOnClickListener {
            Toast.makeText(this, "Click", Toast.LENGTH_LONG).show()
        }
    }
}