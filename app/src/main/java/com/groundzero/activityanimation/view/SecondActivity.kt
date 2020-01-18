package com.groundzero.activityanimation.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.groundzero.activityanimation.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(R.layout.activity_second) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        close_activity_button.setOnClickListener { onBackPressed() }
    }
}
