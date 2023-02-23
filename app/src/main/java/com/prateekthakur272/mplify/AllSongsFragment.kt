package com.prateekthakur272.mplify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.prateekthakur272.mplify.adapter.ListAdapter
import com.prateekthakur272.mplify.databinding.FragmentAllSongsBinding

class AllSongsFragment : Fragment() {
    private lateinit var binding: FragmentAllSongsBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentAllSongsBinding.inflate(inflater,container,false)
        binding.allTracksRecyclerView.adapter = ListAdapter(arrayListOf())
        binding.allTracksRecyclerView.layoutManager = LinearLayoutManager(context)
        return binding.root
    }
}