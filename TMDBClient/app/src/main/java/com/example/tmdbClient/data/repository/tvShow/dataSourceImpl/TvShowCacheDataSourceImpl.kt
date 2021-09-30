package com.example.tmdbClient.data.repository.tvShow.dataSourceImpl

import com.example.tmdbClient.data.model.tvShow.TvShow
import com.example.tmdbClient.data.repository.tvShow.dataSource.TvShowCacheDataSource

class TvShowCacheDataSourceImpl : TvShowCacheDataSource {
    private var tvShowsList = ArrayList<TvShow>()

    override suspend fun getTvShowsFromCache(): List<TvShow> {
        return tvShowsList
    }

    override suspend fun saveTvShowsToCache(tvShows : List<TvShow>) {
        tvShowsList.clear()
        tvShowsList = tvShowsList as ArrayList<TvShow>
    }
}