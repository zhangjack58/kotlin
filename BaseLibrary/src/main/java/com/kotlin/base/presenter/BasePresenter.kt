package com.kotlin.base.presenter

import com.kotlin.base.presenter.view.BaseView

/**
 * Created by zhangjian on 2018/5/14.
 */
open class BasePresenter<T:BaseView> {
    lateinit var mView:T

}