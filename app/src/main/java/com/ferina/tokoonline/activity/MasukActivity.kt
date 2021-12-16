package com.ferina.tokoonline.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ferina.tokoonline.R
import com.ferina.tokoonline.helper.SharedPref
import kotlinx.android.synthetic.main.activity_masuk.*

class MasukActivity : AppCompatActivity() {

    lateinit var s:SharedPref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)

        s= SharedPref(this)

        mainButton()
    }
    fun mainButton(){
        btn_prosesLogin.setOnClickListener{
            s.setStatusLogin(true)
        }
        btn_register.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }
    }
}
