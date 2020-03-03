package com.d3if4201.h_2ass


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.d3if4201.h_2ass.databinding.FragmentQuisBinding

/**
 * A simple [Fragment] subclass.
 */
class QuisFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentQuisBinding>(inflater, R.layout.fragment_quis,container,false)
        binding.apply {
            btnSubmit.setOnClickListener{
                val check =radioGroup.checkedRadioButtonId
                var index = 0
                when(check){
                    R.id.rdKucing ->index =1
                    R.id.rdKelinci->index=2
                    R.id.rdKuda->index=3
                    R.id.rdSapi->index=4
                }
                if (index ==2||index==3||index==4){
                    view?.findNavController()?.navigate(R.id.action_quisFragment_to_loseFragment)
                }else{
                    view?.findNavController()?.navigate(R.id.action_quisFragment_to_winFragment4)
                }
            }
        }

        return binding.root
    }


}
