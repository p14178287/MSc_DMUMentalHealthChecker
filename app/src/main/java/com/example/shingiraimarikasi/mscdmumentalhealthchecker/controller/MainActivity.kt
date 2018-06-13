package com.example.shingiraimarikasi.mscdmumentalhealthchecker.controller


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

import com.example.shingiraimarikasi.mscdmumentalhealthchecker.R


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.signUpNewUser).setOnClickListener(this)

    }


    override fun onClick(v: View) {
        when (v.id) {
            R.id.signUpNewUser -> startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}
