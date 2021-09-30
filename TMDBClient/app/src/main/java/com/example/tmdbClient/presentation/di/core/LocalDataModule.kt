package com.example.tmdbClient.presentation.di.core

import com.example.tmdbClient.data.db.ArtistDao
import com.example.tmdbClient.data.db.MovieDao
import com.example.tmdbClient.data.db.TvShowDao
import com.example.tmdbClient.data.repository.artist.dataSource.ArtistLocalDataSource
import com.example.tmdbClient.data.repository.artist.dataSourceImpl.ArtistLocalDataSourceImpl
import com.example.tmdbClient.data.repository.movie.dataSorce.MovieLocalDataSource
import com.example.tmdbClient.data.repository.movie.dataSourceImpl.MovieLocalDataSourceImpl
import com.example.tmdbClient.data.repository.tvShow.dataSource.TvShowLocalDataSource
import com.example.tmdbClient.data.repository.tvShow.dataSourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao):MovieLocalDataSource{
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao):TvShowLocalDataSource{
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao : ArtistDao):ArtistLocalDataSource{
        return ArtistLocalDataSourceImpl(artistDao)
    }


}