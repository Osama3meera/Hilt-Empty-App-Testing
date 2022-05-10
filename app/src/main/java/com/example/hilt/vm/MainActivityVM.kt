package com.example.hilt.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hilt.model.TeamModel
import com.example.hilt.repo.TeamRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityVM @Inject constructor(
    private val teamRepo: TeamRepo
) : ViewModel() {
    private val teamRepoEmitter = MutableLiveData<List<TeamModel>>()
    val liveTeamRepo: LiveData<List<TeamModel>> = teamRepoEmitter

    init {
        loadTeam()
    }

    private fun loadTeam() {
        teamRepoEmitter.value = teamRepo.getTeam()
    }
}