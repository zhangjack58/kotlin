package com.kotlin.base.presenter.view

/**
 * Created by zhangjian on 2018/5/14.
 */
interface BaseView {
    fun showLoading()

    fun hideLoading()

    fun onError()
}