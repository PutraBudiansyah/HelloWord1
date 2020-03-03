package com.d3if4201.h_2ass


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.d3if4201.h_2ass.databinding.FragmentIceBinding

/**
 * A simple [Fragment] subclass.
 */
class IceFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentIceBinding>(inflater,R.layout.fragment_ice,container,false)


        return binding.root
    }


}
