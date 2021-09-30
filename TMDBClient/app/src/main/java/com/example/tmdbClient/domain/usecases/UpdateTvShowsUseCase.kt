package com.example.tmdbClient.domain.usecases

import com.example.tmdbClient.data.model.tvShow.TvShow
import com.example.tmdbClient.domain.repository.TvShowRepository

class UpdateTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?=tvShowRepository.updateTvShows()
}