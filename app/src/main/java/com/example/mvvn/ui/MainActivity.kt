package com.example.mvvn.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var mBinding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding?.root)

        initView()
    }

    private fun initView() {
        mBinding?.callApiBtn?.setOnClickListener {
            val intent = Intent(this, PhotoListActivity::class.java).apply {
            }
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }
}