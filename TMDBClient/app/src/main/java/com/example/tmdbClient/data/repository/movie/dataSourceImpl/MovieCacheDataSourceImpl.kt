package com.example.tmdbClient.data.repository.movie.dataSourceImpl

import com.example.tmdbClient.data.model.movie.Movie
import com.example.tmdbClient.data.repository.movie.dataSorce.MovieCacheDataSource

class MovieCacheDataSourceImpl :
    MovieCacheDataSource {
    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }
}