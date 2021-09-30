package com.example.tmdbClient.data.repository.tvShow.dataSource

import com.example.tmdbClient.data.model.tvShow.TvShow

interface TvShowLocalDataSource {

    suspend fun getTvShowsFromDB() : List<TvShow>

    suspend fun clearAllTvShowsFromDB()

    suspend fun saveTvShowsToDB(movies: List<TvShow>)
}