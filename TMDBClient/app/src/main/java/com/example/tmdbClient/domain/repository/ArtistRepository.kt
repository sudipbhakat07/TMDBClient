package com.example.tmdbClient.domain.repository

import com.example.tmdbClient.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtists():List<Artist>?
    suspend fun updateArtists():List<Artist>?
}