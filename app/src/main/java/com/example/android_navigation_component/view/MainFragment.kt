package com.example.android_navigation_component.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.android_navigation_component.R
import com.example.android_navigation_component.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : BaseFragment() {

    private var navController: NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        btnTop.setOnClickListener {
            navController!!.navigate(R.id.action_mainFragment_to_topFragment)
        }

        btnMiddle.setOnClickListener {
            navController!!.navigate(R.id.action_mainFragment_to_middleFragment)
        }

        btnBottom.setOnClickListener {
            navController!!.navigate(R.id.action_mainFragment_to_bottomFragment)
        }
    }

}