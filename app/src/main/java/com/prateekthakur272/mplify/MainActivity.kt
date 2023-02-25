package com.prateekthakur272.mplify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.prateekthakur272.mplify.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if(savedInstanceState != null) return

//        supportActionBar?.title = getString(R.string.player)
//        supportFragmentManager.commit {
//            replace(R.id.fragment_container,PlayerFragment())
//        }
//
//        binding.mainNavBar.selectedItemId = R.id.action_player
//
//        binding.mainNavBar.setOnItemSelectedListener { item ->
//            when(item.itemId){
//                R.id.action_player -> {
//                    supportFragmentManager.commit {
//                        replace(R.id.fragment_container,PlayerFragment())
//                    }
//                    supportActionBar?.title = getString(R.string.player)
//                    return@setOnItemSelectedListener true
//                }
//                R.id.action_music_queue -> {
//                    supportFragmentManager.commit {
//                        replace(R.id.fragment_container,QueueFragment())
//                    }
//                    supportActionBar?.title = getString(R.string.queue)
//                    return@setOnItemSelectedListener true
//                }
//                R.id.action_music_list -> {
//                    supportFragmentManager.commit {
//                        replace(R.id.fragment_container,AllSongsFragment())
//                    }
//                    supportActionBar?.title = getString(R.string.all_songs)
//                    return@setOnItemSelectedListener true
//                }
//                else -> {
//                    return@setOnItemSelectedListener false
//                }
//            }
//        }

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        val navController = navHostFragment.navController
        binding.mainNavBar.setupWithNavController(navController)
    }
}