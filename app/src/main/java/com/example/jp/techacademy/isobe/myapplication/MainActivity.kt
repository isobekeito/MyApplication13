package com.example.jp.techacademy.isobe.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val human=Human("メンバ変数から取得",18,"hobby")
       human.say()


        val human2=Human("メンバ変数から取得",18,"hobby")
        human2.think()


    }
}
