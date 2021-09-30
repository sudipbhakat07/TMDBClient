package com.example.tmdbClient.presentation.di.core

import com.example.tmdbClient.data.repository.artist.dataSource.ArtistCacheDataSource
import com.example.tmdbClient.data.repository.artist.dataSourceImpl.ArtistCacheDataSourceImpl
import com.example.tmdbClient.data.repository.movie.dataSorce.MovieCacheDataSource
import com.example.tmdbClient.data.repository.movie.dataSourceImpl.MovieCacheDataSourceImpl
import com.example.tmdbClient.data.repository.tvShow.dataSource.TvShowCacheDataSource
import com.example.tmdbClient.data.repository.tvShow.dataSourceImpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }


}