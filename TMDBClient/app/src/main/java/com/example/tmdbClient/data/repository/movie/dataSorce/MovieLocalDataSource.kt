package com.example.tmdbClient.data.repository.movie.dataSorce

import com.example.tmdbClient.data.model.movie.Movie

interface MovieLocalDataSource {

    suspend fun getMoviesFromDB() : List<Movie>

    suspend fun clearAll()

    suspend fun saveMoviesToDB(movies: List<Movie>)
}