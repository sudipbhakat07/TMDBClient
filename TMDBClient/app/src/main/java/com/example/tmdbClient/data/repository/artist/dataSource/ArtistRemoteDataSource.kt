package com.example.tmdbClient.data.repository.artist.dataSource

import com.example.tmdbClient.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {
    suspend fun getArtists(): Response<ArtistList>
}