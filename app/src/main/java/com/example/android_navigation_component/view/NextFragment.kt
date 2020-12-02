package com.example.android_navigation_component.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.android_navigation_component.R
import com.example.android_navigation_component.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_next.*


class NextFragment : BaseFragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_next, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        btnNext.setOnClickListener {
            val bundle = bundleOf("bundle" to "Hello"
            , "another" to 100)
            navController.navigate(R.id.action_nextFragment_to_afterNextFragment, bundle)
        }
    }


}