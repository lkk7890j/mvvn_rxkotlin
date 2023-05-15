package com.example.mvvn.datamodel

import com.example.mvvn.bean.PhotoBean
import com.example.mvvn.network.IGetApiCallback
import com.example.mvvn.network.RetrofitInstance
import io.reactivex.rxjava3.core.Single

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SMainDataModel {
    private val mMainService = RetrofitInstance.api

//    fun getPhotoList(callback: IGetApiCallback) {
//        mMainService.getPhotos()
//            .enqueue(object : Callback<PhotoBean> {
//                override fun onResponse(
//                    call: Call<PhotoBean>,
//                    response: Response<PhotoBean>
//                ) {
//                    response.body()?.let {
//                        callback.onGetResponse(it)
//                    }
//                }
//
//                override fun onFailure(call: Single<PhotoBean>, t: Throwable) {
//                    callback.onGetFailure(t.toString())
//                }
//            })
//    }

    fun getPhotoList(): Single<PhotoBean> {
        return mMainService.getPhotos()
    }
}