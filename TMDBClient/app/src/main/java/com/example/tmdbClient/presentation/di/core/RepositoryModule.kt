package com.example.tmdbClient.presentation.di.core

import com.example.tmdbClient.data.repository.artist.ArtistRepositoryImpl
import com.example.tmdbClient.data.repository.artist.dataSource.ArtistCacheDataSource
import com.example.tmdbClient.data.repository.artist.dataSource.ArtistLocalDataSource
import com.example.tmdbClient.data.repository.artist.dataSource.ArtistRemoteDataSource
import com.example.tmdbClient.data.repository.movie.MovieRepositoryImpl
import com.example.tmdbClient.data.repository.movie.dataSorce.MovieCacheDataSource
import com.example.tmdbClient.data.repository.movie.dataSorce.MovieLocalDataSource
import com.example.tmdbClient.data.repository.movie.dataSorce.MovieRemoteDataSource
import com.example.tmdbClient.data.repository.tvShow.TvShowRepositoryImpl
import com.example.tmdbClient.data.repository.tvShow.dataSource.TvShowCacheDataSource
import com.example.tmdbClient.data.repository.tvShow.dataSource.TvShowLocalDataSource
import com.example.tmdbClient.data.repository.tvShow.dataSource.TvShowRemoteDataSource
import com.example.tmdbClient.domain.repository.ArtistRepository
import com.example.tmdbClient.domain.repository.MovieRepository
import com.example.tmdbClient.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDataSource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {

        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDataSource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {

        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource
        )


    }

}