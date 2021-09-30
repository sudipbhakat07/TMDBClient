package com.example.tmdbClient.data.repository.tvShow.dataSource

import com.example.tmdbClient.data.model.tvShow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {

    suspend fun getTvShows() : Response<TvShowList>
}
