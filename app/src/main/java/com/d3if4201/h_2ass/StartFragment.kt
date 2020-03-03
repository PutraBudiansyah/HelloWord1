package com.d3if4201.h_2ass


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.d3if4201.h_2ass.databinding.FragmentStartBinding

/**
 * A simple [Fragment] subclass.
 */
class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            val binding :FragmentStartBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_start, container, false)
        binding.apply {
               btPersegi.setOnClickListener{v:View ->
                    v.findNavController().navigate(R.id.action_startFragment2_to_persegiFragment2)


            }
            btQuis.setOnClickListener{x:View ->
                x.findNavController().navigate(R.id.action_startFragment2_to_quisFragment)
            }
            btDiceRoller.setOnClickListener{y:View->
                y.findNavController().navigate(R.id.action_startFragment2_to_iceFragment)
        }
            }

        setHasOptionsMenu(true)
        return binding.root

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
            view!!.findNavController())
                || super.onOptionsItemSelected(item)
    }


}
