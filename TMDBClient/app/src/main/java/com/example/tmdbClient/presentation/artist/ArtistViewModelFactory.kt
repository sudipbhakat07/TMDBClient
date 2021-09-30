package com.example.tmdbClient.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.tmdbClient.domain.usecases.GetArtistsUseCase
import com.example.tmdbClient.domain.usecases.UpdateArtistsUseCase

class ArtistViewModelFactory(
    private val getArtistsUseCase: GetArtistsUseCase,
    private val updateArtistsUseCase: UpdateArtistsUseCase
):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ArtistViewModel(
            getArtistsUseCase,
            updateArtistsUseCase
        ) as T
    }
}