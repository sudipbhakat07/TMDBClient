package com.example.tmdbClient.data.repository.movie.dataSorce

import com.example.tmdbClient.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {

    suspend fun getMovies() : Response<MovieList>
}