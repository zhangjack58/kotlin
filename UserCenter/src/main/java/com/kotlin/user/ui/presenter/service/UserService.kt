package com.kotlin.user.ui.presenter.service

import rx.Observable
import java.util.*

/**
 * Created by zhangjian on 2018/5/14.
 */
interface UserService {

    fun register(mobile:String,veriryCode:String,pwd:String):Observable<Boolean>
}