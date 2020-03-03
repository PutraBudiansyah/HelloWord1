package com.d3if4201.h_2ass


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.d3if4201.h_2ass.databinding.FragmentWinBinding

/**
 * A simple [Fragment] subclass.
 */
class WinFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      val binding = DataBindingUtil.inflate<FragmentWinBinding>(inflater,R.layout.fragment_win,container,false)
       binding.apply {
           btBack.setOnClickListener{z:View->
               z.findNavController().navigate(R.id.action_winFragment4_to_quisFragment)

           }
       }

        return binding.root
    }



}
