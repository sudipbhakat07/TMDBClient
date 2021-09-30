package com.example.tmdbClient.presentation.tvShow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.tmdbClient.domain.usecases.GetTvShowsUseCase
import com.example.tmdbClient.domain.usecases.UpdateTvShowsUseCase

class TvShowViewModelFactory(private val getTvShowUseCase: GetTvShowsUseCase,
                             private  val updateTvShowsUseCase: UpdateTvShowsUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TvShowViewModelFactory(getTvShowUseCase , updateTvShowsUseCase) as T
    }
}