package com.d3if4201.h_2ass


import android.content.ActivityNotFoundException
import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ShareCompat
import androidx.databinding.DataBindingUtil
import com.d3if4201.h_2ass.databinding.FragmentPersegiBinding
import kotlinx.android.synthetic.main.fragment_persegi.*

/**
 * A simple [Fragment] subclass.
 */
class PersegiFragment : Fragment() {
    companion object{
        var p = 0
        var l = 0
        var Luas = 0
        var Keliling =0
        var KeyLuas = "1"
        var KeyKeliling ="2"

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentPersegiBinding>(inflater, R.layout.fragment_persegi
        ,container,false)

        if (savedInstanceState!=null){
            Luas = savedInstanceState.getInt(KeyLuas)
            Keliling =savedInstanceState.getInt(KeyKeliling)
            binding.tvLuas.setText(Luas.toString())
            binding.tvKeliling.setText(Keliling.toString())
        }

        binding.btHitung.setOnClickListener{
        p = etPanjang.text.toString().toInt()
        l = etLebar.text.toString().toInt()
        Luas = p * l
        Keliling = 2 *(p * l)
        tvLuas.setText(Luas.toString())
        tvKeliling.setText(Keliling.toString())
        }

        binding.btnShare.setOnClickListener{
         val shareIntent = ShareCompat.IntentBuilder.from(requireActivity())
             .setType("Text/plaint")
             .setText(getString(R.string.share_PP,p,l,Luas,Keliling))
             .intent
            try {
                startActivity(shareIntent)

            }catch (ex: ActivityNotFoundException){
                Toast.makeText(context,"NotFound",Toast.LENGTH_LONG).show()

            }
        }
        return binding.root
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(KeyLuas, Luas)
        outState.putInt(KeyKeliling, Keliling)
        super.onSaveInstanceState(outState)
    }
}
