package com.example.tmdbClient.data.repository.movie.dataSorce

import com.example.tmdbClient.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies:List<Movie>)

}