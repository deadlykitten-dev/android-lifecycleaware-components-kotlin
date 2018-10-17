package com.kestrel9.android.androidlifecycleawarecomponents_kotlin.step1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kestrel9.android.androidlifecycleawarecomponents_kotlin.R

class ChronoActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chrono1)
    }
}
