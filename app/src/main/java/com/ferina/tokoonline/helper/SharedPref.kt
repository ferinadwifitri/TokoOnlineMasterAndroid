package com.ferina.tokoonline.helper

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import kotlin.math.log

class SharedPref(activity: Activity) {
    val login = "login"
    val mypref = "MAIN_PRF"
    val sp:SharedPreferences

    init {
        sp = activity.getSharedPreferences(mypref,Context.MODE_PRIVATE)
    }

    fun setStatusLogin(staus:Boolean){
        sp.edit().putBoolean(login,staus).apply()
    }

    fun getStatusLogin():Boolean{
        return sp.getBoolean(login,false)
    }
}