package com.example.tmdbClient.data.repository.artist.dataSource

import com.example.tmdbClient.data.model.artist.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache():List<Artist>
    suspend fun saveArtistsToCache(artists:List<Artist>)

}