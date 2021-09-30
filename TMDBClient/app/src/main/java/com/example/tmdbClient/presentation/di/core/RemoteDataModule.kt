package com.example.tmdbClient.presentation.di.core

import com.example.tmdbClient.data.api.TmdbService
import com.example.tmdbClient.data.repository.artist.dataSource.ArtistRemoteDataSource
import com.example.tmdbClient.data.repository.artist.dataSourceImpl.ArtistRemoteDataSourceImpl
import com.example.tmdbClient.data.repository.movie.dataSorce.MovieRemoteDataSource
import com.example.tmdbClient.data.repository.movie.dataSourceImpl.MovieRemoteDataSourceImpl
import com.example.tmdbClient.data.repository.tvShow.dataSource.TvShowRemoteDataSource
import com.example.tmdbClient.data.repository.tvShow.dataSourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey : String) {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TmdbService) :MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(tmdbService,apiKey)
    }
    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TmdbService) : ArtistRemoteDataSource {
        return ArtistRemoteDataSourceImpl(tmdbService,apiKey)
    }
    @Singleton
    @Provides
    fun provideTvShowsRemoteDataSource(tmdbService: TmdbService) : TvShowRemoteDataSource {
        return TvShowRemoteDataSourceImpl(tmdbService,apiKey)
    }
}

