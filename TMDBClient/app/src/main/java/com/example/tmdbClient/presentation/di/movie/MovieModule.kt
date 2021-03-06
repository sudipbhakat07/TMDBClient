package com.example.tmdbClient.presentation.di.movie

import com.example.tmdbClient.domain.usecases.*
import com.example.tmdbClient.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory( getMoviesUseCase: GetMoviesUseCase,
                                      updateMovieUseCase: UpdateMovieUseCase
    ) : MovieViewModelFactory {
        return MovieViewModelFactory(getMoviesUseCase,updateMovieUseCase)
    }

}