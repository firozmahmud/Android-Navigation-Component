package com.example.android_navigation_component.base

import android.widget.Toast
import androidx.fragment.app.Fragment

open class BaseFragment : Fragment() {

    fun showToast(text: Any) {
        Toast.makeText(context, text.toString(), Toast.LENGTH_LONG).show()
    }
}