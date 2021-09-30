package com.example.tmdbClient.domain.usecases

import com.example.tmdbClient.data.model.artist.Artist
import com.example.tmdbClient.domain.repository.ArtistRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.updateArtists()
}