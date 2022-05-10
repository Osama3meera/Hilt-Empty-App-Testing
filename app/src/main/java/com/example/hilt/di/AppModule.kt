package com.example.hilt.di

import com.example.hilt.repo.TeamRepo
import com.example.hilt.repo.TeamRepoImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideTeamRepo(): TeamRepo = TeamRepoImpl()
}