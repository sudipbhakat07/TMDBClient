package com.example.tmdbClient.data.repository.tvShow

import android.util.Log
import com.example.tmdbClient.data.model.tvShow.TvShow
import com.example.tmdbClient.data.model.tvShow.TvShowList
import com.example.tmdbClient.data.repository.tvShow.dataSource.TvShowCacheDataSource
import com.example.tmdbClient.data.repository.tvShow.dataSource.TvShowLocalDataSource
import com.example.tmdbClient.data.repository.tvShow.dataSource.TvShowRemoteDataSource
import com.example.tmdbClient.domain.repository.TvShowRepository
//import com.example.tmdbClient.domain.repository.TvShowsRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

class TvShowRepositoryImpl(
    private val tvShowRemoteDatasource: TvShowRemoteDataSource,
    private val tvShowLocalDataSource: TvShowLocalDataSource,
    private val tvShowCacheDataSource: TvShowCacheDataSource
) : TvShowRepository {
    override suspend fun getTvShows(): List<TvShow>? {
        return getTvShowsFromCache()
    }

    override suspend fun updateTvShows(): List<TvShow>? {
        val newListOfTvShows = getTvShowsFromAPI()
        tvShowLocalDataSource.clearAllTvShowsFromDB()
        tvShowLocalDataSource.saveTvShowsToDB(newListOfTvShows)
        tvShowCacheDataSource.saveTvShowsToCache(newListOfTvShows)
        return newListOfTvShows
    }

    suspend fun getTvShowsFromAPI(): List<TvShow> {
        lateinit var tvShowList: List<TvShow>
        try {
            val response = tvShowRemoteDatasource.getTvShows()
            val body = response.body()
            if (body != null) {
                tvShowList = body.TvShows
            }
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        return tvShowList
    }

    suspend fun getTvShowsFromDB(): List<TvShow> {
        lateinit var tvShowsList: List<TvShow>
        try {
            tvShowsList = tvShowLocalDataSource.getTvShowsFromDB()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if (tvShowsList.size > 0) {
            return tvShowsList
        } else {
            tvShowsList = getTvShowsFromAPI()
            tvShowLocalDataSource.saveTvShowsToDB(tvShowsList)
        }

        return tvShowsList
    }

    suspend fun getTvShowsFromCache(): List<TvShow> {
        lateinit var tvShowsList: List<TvShow>
        try {
            tvShowsList = tvShowCacheDataSource.getTvShowsFromCache()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if (tvShowsList.size > 0) {
            return tvShowsList
        } else {
            tvShowsList = getTvShowsFromDB()
            tvShowCacheDataSource.saveTvShowsToCache(tvShowsList)
        }

        return tvShowsList
    }
}







