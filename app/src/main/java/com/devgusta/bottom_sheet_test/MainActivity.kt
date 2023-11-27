package com.devgusta.bottom_sheet_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devgusta.bottom_sheet_test.databinding.ActivityMainBinding
import com.devgusta.bottom_sheet_test.utils.initBottomSheet

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getListeners()
    }

    private fun getListeners() {
        binding.button.setOnClickListener {
            initBottomSheet(msg = R.string.test_congratulations)
        }
    }
}