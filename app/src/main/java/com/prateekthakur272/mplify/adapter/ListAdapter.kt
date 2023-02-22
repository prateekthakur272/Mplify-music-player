package com.prateekthakur272.mplify.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.prateekthakur272.mplify.data.Track
import com.prateekthakur272.mplify.databinding.TrackViewLayoutBinding

class ListAdapter:Adapter<ListAdapter.ViewHolder>() {

    private val tracks:ArrayList<Track> = arrayListOf<Track>()
    private lateinit var binding: TrackViewLayoutBinding

    inner class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = TrackViewLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding.root)
    }

    override fun getItemCount(): Int = tracks.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(binding){
            title.text = tracks[position].title
        }
    }

}