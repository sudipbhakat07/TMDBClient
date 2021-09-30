package com.example.tmdbClient.presentation.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.tmdbClient.data.model.movie.Movie
import com.example.tmdbClient.domain.usecases.GetMoviesUseCase
import com.example.tmdbClient.domain.usecases.UpdateMovieUseCase

class MovieViewModel(private val getMoviesUseCase: GetMoviesUseCase,
                        private  val updateMovieUseCase: UpdateMovieUseCase) : ViewModel() {

        fun getMovies() : LiveData<List<Movie>?> = liveData {
            val result = getMoviesUseCase.execute()
            emit(result)
        }
    fun updateMovies() = liveData<List<Movie>?> {
        emit(updateMovieUseCase.execute())
    }
}