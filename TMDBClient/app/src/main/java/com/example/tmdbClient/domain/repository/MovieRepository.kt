package com.example.tmdbClient.domain.repository

import com.example.tmdbClient.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?

}