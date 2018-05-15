package com.kotlin.user.ui.presenter.service.impl

import com.kotlin.user.ui.presenter.service.UserService
import rx.Observable

/**
 * Created by zhangjian on 2018/5/14.
 */
class UserServiceImpl : UserService {
    override fun register(mobile: String, veriryCode: String, pwd: String): Observable<Boolean> {
        return Observable.just(true)
    }

}