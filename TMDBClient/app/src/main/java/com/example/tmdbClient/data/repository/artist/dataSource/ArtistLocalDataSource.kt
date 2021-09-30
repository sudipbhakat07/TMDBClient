package com.example.tmdbClient.data.repository.artist.dataSource

import com.example.tmdbClient.data.model.artist.Artist

interface ArtistLocalDataSource {
    suspend fun getArtistsFromDB():List<Artist>
    suspend fun saveArtistsToDB(artists:List<Artist>)
    suspend fun clearAll()
}