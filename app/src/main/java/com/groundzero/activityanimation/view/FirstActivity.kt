package com.groundzero.activityanimation.view

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.groundzero.activityanimation.R
import kotlinx.android.synthetic.main.activity_first.*


class FirstActivity : AppCompatActivity(R.layout.activity_first) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        change_activity_button.setOnClickListener { startSecondActivity() }
    }

    private fun startSecondActivity() {
        val options =
            ActivityOptions.makeSceneTransitionAnimation(
                this,
                first_activity_transition_image,
                "transition_image"
            )
        Intent(this@FirstActivity, SecondActivity::class.java).apply {
            startActivity(this, options.toBundle())
        }
    }
}
