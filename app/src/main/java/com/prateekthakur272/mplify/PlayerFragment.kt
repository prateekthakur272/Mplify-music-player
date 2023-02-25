package com.prateekthakur272.mplify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.prateekthakur272.mplify.databinding.FragmentPlayerBinding
import com.prateekthakur272.mplify.viewmodel.PlayerViewModel

class PlayerFragment : Fragment() {
    private lateinit var binding: FragmentPlayerBinding
    private val viewModel by viewModels<PlayerViewModel>()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPlayerBinding.inflate(inflater,container,false)
        viewModel.title.observe(viewLifecycleOwner){
            binding.title.text = viewModel.title.value
        }

        with(binding.buttonPlayPause){
            setOnClickListener {
                viewModel.changeTitle("Play")
            }
        }
        with(binding.buttonPrev){
            setOnClickListener {
                viewModel.changeTitle("prev")
            }
        }
        with(binding.buttonNext){
            setOnClickListener {
                viewModel.changeTitle("next")
            }
        }
        return binding.root
    }
}