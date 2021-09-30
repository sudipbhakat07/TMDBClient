package com.example.tmdbClient.data.repository.tvShow.dataSourceImpl

import com.example.tmdbClient.data.api.TmdbService
import com.example.tmdbClient.data.model.tvShow.TvShowList
import com.example.tmdbClient.data.repository.tvShow.dataSource.TvShowRemoteDataSource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(private  val tmdbService: TmdbService, private  val apiKey: String) :
    TvShowRemoteDataSource {
    override suspend fun getTvShows(): Response<TvShowList> {
        return  tmdbService.getPopularTvShows(apiKey)
    }


}