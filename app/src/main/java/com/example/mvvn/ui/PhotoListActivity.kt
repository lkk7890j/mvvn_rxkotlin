package com.example.mvvn.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvvn.bean.PhotoBean
import com.example.mvvn.databinding.ActivityPhotoListBinding
import com.example.mvvn.ui.adapter.PhotoAdapter
import com.example.mvvn.viewmodel.SMainViewModel

class PhotoListActivity : AppCompatActivity() {
    private var mBinding: ActivityPhotoListBinding? = null
    private lateinit var mAdapterPhotoList: PhotoAdapter
    private lateinit var mViewModel: SMainViewModel
    private lateinit var mPhotoList: PhotoBean

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityPhotoListBinding.inflate(layoutInflater)
        setContentView(mBinding?.root)
        mViewModel = ViewModelProvider(this)[SMainViewModel::class.java]
        mViewModel.queryPhotoList()


        mBinding?.rvList?.layoutManager = GridLayoutManager(this,4)
        mViewModel.mDataHPhotoList.observe(this) {

            mPhotoList = mViewModel?.mDataHPhotoList?.value!!
            mAdapterPhotoList = PhotoAdapter(this, mPhotoList)

            mBinding?.rvList?.adapter = mAdapterPhotoList
        }

    }
}