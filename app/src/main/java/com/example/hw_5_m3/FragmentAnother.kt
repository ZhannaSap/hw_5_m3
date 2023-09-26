package com.example.hw_5_m3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_5_m3.databinding.FragmentAnotherBinding
import com.example.hw_5_m3.databinding.FragmentBinding


class FragmentAnother : Fragment() {

    private lateinit var binding: FragmentAnotherBinding
    var result = arguments?.getString("key")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnotherBinding.inflate(inflater, container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        result = arguments?.getString("key")
        binding.text.text = result.toString()

    }
}