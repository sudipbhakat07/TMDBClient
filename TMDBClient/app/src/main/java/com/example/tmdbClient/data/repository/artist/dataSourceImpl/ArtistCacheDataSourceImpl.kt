package com.example.tmdbClient.data.repository.artist.dataSourceImpl

import com.example.tmdbClient.data.model.artist.Artist
import com.example.tmdbClient.data.repository.artist.dataSource.ArtistCacheDataSource

class ArtistCacheDataSourceImpl :
    ArtistCacheDataSource {
    private var artistList = ArrayList<Artist>()

    override suspend fun getArtistsFromCache(): List<Artist> {
        return artistList
    }

    override suspend fun saveArtistsToCache(artists: List<Artist>) {
        artistList.clear()
        artistList = ArrayList(artists)
    }
}