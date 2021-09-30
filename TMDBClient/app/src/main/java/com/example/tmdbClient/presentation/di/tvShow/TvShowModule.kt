package com.example.tmdbClient.presentation.di.tvShow

import com.example.tmdbClient.domain.usecases.*
import com.example.tmdbClient.presentation.tvShow.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {

    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(getTvShowUseCase: GetTvShowsUseCase,
                                      updateTvShowsUseCase: UpdateTvShowsUseCase
    ) : TvShowViewModelFactory {
        return TvShowViewModelFactory(getTvShowUseCase,updateTvShowsUseCase)
    }

}