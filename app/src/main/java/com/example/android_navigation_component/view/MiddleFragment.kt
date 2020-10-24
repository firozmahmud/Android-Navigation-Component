package com.example.android_navigation_component.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.android_navigation_component.R
import com.example.android_navigation_component.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_middle.*


class MiddleFragment : BaseFragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_middle, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        btnNext.setOnClickListener {
            navController!!.navigate(R.id.action_middleFragment_to_nextFragment)
        }
    }


}