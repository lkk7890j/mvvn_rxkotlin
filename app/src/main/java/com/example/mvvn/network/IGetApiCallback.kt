package com.example.mvvn.network

interface IGetApiCallback {
    fun onGetResponse(data: Any)
    fun onGetFailure(msg: String)
}