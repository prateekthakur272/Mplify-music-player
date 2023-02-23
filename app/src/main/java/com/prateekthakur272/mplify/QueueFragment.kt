package com.prateekthakur272.mplify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.prateekthakur272.mplify.adapter.ListAdapter
import com.prateekthakur272.mplify.databinding.FragmentQueueBinding

class QueueFragment : Fragment() {
    private lateinit var binding: FragmentQueueBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentQueueBinding.inflate(inflater,container,false)
        binding.queueRecyclerView.adapter = ListAdapter(arrayListOf())
        binding.queueRecyclerView.layoutManager = LinearLayoutManager(context)
        return binding.root
    }

}