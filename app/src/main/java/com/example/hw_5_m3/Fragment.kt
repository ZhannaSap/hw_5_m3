package com.example.hw_5_m3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_5_m3.databinding.FragmentBinding

class Fragment : Fragment() {
    private lateinit var binding: FragmentBinding
    private var count = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.button.setOnClickListener { view ->
            if (count < 10 && binding.button.text!="-1") {
                count++
                binding.text.text = count.toString()
            } else if (count == 10 || count<10 && count>0) {
                binding.button.text = "-1"
                count--
                binding.text.text = count.toString()
            } else if (count == 0) {
                val fragmentAnother = FragmentAnother()
                var bundle = Bundle()

                bundle.putString("key", count.toString())
                fragmentAnother.arguments = bundle

                parentFragmentManager.beginTransaction().replace(R.id.container, fragmentAnother)
                    .commit()
            }
        }
    }
}