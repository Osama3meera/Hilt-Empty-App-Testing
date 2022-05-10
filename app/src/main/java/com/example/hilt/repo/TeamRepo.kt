package com.example.hilt.repo

import com.example.hilt.model.TeamModel

interface TeamRepo {

    fun getTeam(): List<TeamModel>
}