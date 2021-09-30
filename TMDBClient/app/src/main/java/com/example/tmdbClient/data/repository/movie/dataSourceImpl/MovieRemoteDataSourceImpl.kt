package com.example.tmdbClient.data.repository.movie.dataSourceImpl

import com.example.tmdbClient.data.api.TmdbService
import com.example.tmdbClient.data.model.movie.MovieList
import com.example.tmdbClient.data.repository.movie.dataSorce.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TmdbService,
    private val apiKey:String
): MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}

