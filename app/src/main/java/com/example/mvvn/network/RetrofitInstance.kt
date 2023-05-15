package com.example.mvvn.network

import com.example.mvvn.network.apiservice.PhotoApi
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
	val api : PhotoApi by lazy {
		Retrofit.Builder()
			.baseUrl("https://jsonplaceholder.typicode.com/")
			.addConverterFactory(GsonConverterFactory.create())
			.addCallAdapterFactory(RxJava3CallAdapterFactory.create())
			.build()
			.create(PhotoApi::class.java)
	}
}
