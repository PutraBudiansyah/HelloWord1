package com.d3if4201.h_2ass


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.d3if4201.h_2ass.databinding.FragmentLoseBinding

/**
 * A simple [Fragment] subclass.
 */
class LoseFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLoseBinding>(inflater, R.layout.fragment_lose,container,false)

        binding.apply {
            btKembali.setOnClickListener{f:View->
                f.findNavController().navigate(R.id.action_loseFragment_to_quisFragment)
            }
        }
        return binding.root
    }


}
