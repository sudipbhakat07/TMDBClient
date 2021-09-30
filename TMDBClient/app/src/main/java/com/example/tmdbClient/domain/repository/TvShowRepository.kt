package com.example.tmdbClient.domain.repository

import com.example.tmdbClient.data.model.tvShow.TvShow

interface TvShowRepository {
    suspend fun getTvShows():List<TvShow>?
    suspend fun updateTvShows():List<TvShow>?
}