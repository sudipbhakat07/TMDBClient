package com.example.tmdbClient.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.tmdbClient.domain.usecases.GetMoviesUseCase
import com.example.tmdbClient.domain.usecases.UpdateMovieUseCase

class MovieViewModelFactory( private val getMoviesUseCase: GetMoviesUseCase,
                             private val updateMovieUseCase: UpdateMovieUseCase) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MovieViewModel(getMoviesUseCase , updateMovieUseCase) as T
    }
}