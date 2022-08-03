package com.ardian.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ardian.android.databinding.ActivityMainBinding
import com.ardian.android.fragment.DataFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showFragment()
    }

    private fun showFragment() {
        val mFragmentManager = supportFragmentManager
        val mFragmentTransaction = mFragmentManager.beginTransaction()
        val mFragment = DataFragment()

        mFragmentTransaction.add(R.id.fl_data, mFragment).commit()
    }
}