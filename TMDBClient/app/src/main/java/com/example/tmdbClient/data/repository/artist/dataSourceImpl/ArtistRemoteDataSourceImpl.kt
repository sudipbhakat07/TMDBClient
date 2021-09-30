package com.example.tmdbClient.data.repository.artist.dataSourceImpl

import com.example.tmdbClient.data.api.TmdbService
import com.example.tmdbClient.data.model.artist.ArtistList
import com.example.tmdbClient.data.repository.artist.dataSource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TmdbService,
    private val apiKey:String
): ArtistRemoteDataSource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}