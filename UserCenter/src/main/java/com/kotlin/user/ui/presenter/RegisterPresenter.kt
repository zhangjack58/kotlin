package com.kotlin.user.ui.presenter

import com.kotlin.base.ext.execute
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.rx.BaseSubscriber
import com.kotlin.user.ui.presenter.service.impl.UserServiceImpl
import com.kotlin.user.ui.presenter.view.RegisterView


/**
 * Created by zhangjian on 2018/5/14.
 */

open class RegisterPresenter : BasePresenter<RegisterView>() {

    fun register(mobile:String,verifyCode:String,pwd:String){
        /**
         * 处理逻辑
         */
        val  userService = UserServiceImpl()
        userService.register(mobile,verifyCode,pwd).execute(object :BaseSubscriber<Boolean>(){
            override fun onNext(p0: Boolean) {
                mView.onRegisterResult(p0)
            }
        })

    }

}