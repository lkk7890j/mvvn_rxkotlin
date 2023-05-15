package com.example.mvvn.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvn.bean.PhotoBean
import com.example.mvvn.datamodel.SMainDataModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class SMainViewModel : ViewModel() {
    private val mDataModelMain = SMainDataModel()

    private val _dataPhotoList = MutableLiveData<PhotoBean>()
    val mDataHPhotoList: LiveData<PhotoBean> = _dataPhotoList

    fun queryPhotoList() {
        mDataModelMain.getPhotoList()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { user ->
                    _dataPhotoList.value = user
                },
                { error ->
                    // 处理错误响应
                }
            )
    }
}