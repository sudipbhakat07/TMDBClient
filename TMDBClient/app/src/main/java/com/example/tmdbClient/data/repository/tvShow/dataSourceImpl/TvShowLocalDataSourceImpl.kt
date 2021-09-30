package com.example.tmdbClient.data.repository.tvShow.dataSourceImpl

import com.example.tmdbClient.data.db.TvShowDao
import com.example.tmdbClient.data.model.tvShow.TvShow
import com.example.tmdbClient.data.repository.tvShow.dataSource.TvShowLocalDataSource

class TvShowLocalDataSourceImpl(private val tvShowDao: TvShowDao) : TvShowLocalDataSource {

    override suspend fun getTvShowsFromDB(): List<TvShow> {
        return tvShowDao.getTvShows()
    }

    override suspend fun clearAllTvShowsFromDB() {
        return tvShowDao.deleteAllTvShows()
    }

    override suspend fun saveTvShowsToDB(tvShows: List<TvShow>) {
        return tvShowDao.saveTvShows(tvShows)
    }


}