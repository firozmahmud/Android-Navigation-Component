package com.example.android_navigation_component.base

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    fun showToast(text: Any) {
        Toast.makeText(baseContext, text.toString(), Toast.LENGTH_LONG).show()
    }

}