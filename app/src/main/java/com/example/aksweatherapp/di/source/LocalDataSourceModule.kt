package com.example.aksweatherapp.di.source

import com.example.aksweatherapp.data.local.LocalDataSource
import com.example.aksweatherapp.data.local.LocalDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class LocalDataSourceModule {
    @Binds
    @ViewModelScoped
    abstract fun bindLocalDataSource(localDataSource: LocalDataSourceImpl): LocalDataSource
}