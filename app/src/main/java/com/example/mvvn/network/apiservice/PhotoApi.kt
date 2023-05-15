package com.example.mvvn.network.apiservice

import com.example.mvvn.bean.PhotoBean
import io.reactivex.rxjava3.core.Single
import retrofit2.Call
import retrofit2.http.GET

interface PhotoApi {
    @GET("/photos")
    fun getPhotos(): Single<PhotoBean>

}