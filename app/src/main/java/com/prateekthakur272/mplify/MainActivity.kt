package com.prateekthakur272.mplify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.commit
import com.prateekthakur272.mplify.databinding.ActivityMainBinding
import com.prateekthakur272.mplify.databinding.FragmentPlayerBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.commit {
            replace(R.id.fragment_container,PlayerFragment())
        }

        binding.mainNavBar.selectedItemId = R.id.action_player

        binding.mainNavBar.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.action_player -> {
                    supportFragmentManager.commit {
                        replace(R.id.fragment_container,PlayerFragment())
                    }
                    return@setOnItemSelectedListener true
                }
                R.id.action_music_queue -> {
                    supportFragmentManager.commit {
                        replace(R.id.fragment_container,QueueFragment())
                    }
                    return@setOnItemSelectedListener true
                }
                R.id.action_music_list -> {
                    supportFragmentManager.commit {
                        replace(R.id.fragment_container,AllSongsFragment())
                    }
                    return@setOnItemSelectedListener true
                }
                else -> {
                    return@setOnItemSelectedListener false
                }
            }
        }
    }
}