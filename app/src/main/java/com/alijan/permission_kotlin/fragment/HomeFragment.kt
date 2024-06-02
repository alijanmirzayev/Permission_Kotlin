package com.alijan.permission_kotlin.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.alijan.permission_kotlin.R
import com.alijan.permission_kotlin.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonsClickListener()
    }

    private fun buttonsClickListener() {
        binding.apply {
            // Location fragment navigate
            buttonNavigateLocation.setOnClickListener {
                findNavController().navigate(R.id.locationFragment)
            }
        }
    }
}