package com.example.tmdbClient.presentation.tvShow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.tmdbClient.data.model.tvShow.TvShow
import com.example.tmdbClient.domain.usecases.GetTvShowsUseCase
import com.example.tmdbClient.domain.usecases.UpdateTvShowsUseCase

class TvShowViewModel(private val getTvShowUseCase: GetTvShowsUseCase,
                      private  val updateTvShowsUseCase: UpdateTvShowsUseCase) : ViewModel() {

        fun getTvShows() : LiveData<List<TvShow>?> = liveData {
            val result = getTvShowUseCase.execute()
            emit(result)
        }
    fun updateTvShows() = liveData<List<TvShow>?> {
        emit(updateTvShowsUseCase.execute())
    }
}