package com.example.tmdbClient.data.api

import com.example.tmdbClient.data.model.artist.ArtistList
import com.example.tmdbClient.data.model.movie.MovieList
import com.example.tmdbClient.data.model.tvShow.TvShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TmdbService {

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query(
            "api_key"
        ) apiKey: String
    ): Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTvShows(
        @Query(
            "api_key"
        ) apiKey: String
    ): Response<TvShowList>

    @GET("person/popular")
    suspend fun getPopularArtists(
        @Query(
            "api_key"
        ) apiKey: String
    ): Response<ArtistList>


}