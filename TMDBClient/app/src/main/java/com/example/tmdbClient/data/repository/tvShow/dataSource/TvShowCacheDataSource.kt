package com.example.tmdbClient.data.repository.tvShow.dataSource

import com.example.tmdbClient.data.model.tvShow.TvShow

interface TvShowCacheDataSource {

    suspend fun getTvShowsFromCache() :List<TvShow>

    suspend fun saveTvShowsToCache(movies : List<TvShow>)
}