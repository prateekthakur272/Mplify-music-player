package com.prateekthakur272.mplify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.prateekthakur272.mplify.databinding.FragmentQueueBinding

class QueueFragment : Fragment() {
    private lateinit var binding: FragmentQueueBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentQueueBinding.inflate(inflater,container,false)

        return binding.root
    }

}