package com.example.hilt.ui

import TeamAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hilt.R
import com.example.hilt.vm.MainActivityVM
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        observeTeamRepo()
    }

    private fun observeTeamRepo() {
        val vm = ViewModelProvider(this).get(MainActivityVM::class.java)
        vm.liveTeamRepo.observe(this) {
            val rec = findViewById<RecyclerView>(R.id.rec)
            rec.layoutManager = LinearLayoutManager(this)
            rec.adapter = TeamAdapter(it)
        }

    }
}