package com.example.tmdbClient.domain.usecases

import com.example.tmdbClient.data.model.movie.Movie
import com.example.tmdbClient.domain.repository.MovieRepository

class UpdateMovieUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? = movieRepository.updateMovies()
}