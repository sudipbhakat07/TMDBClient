package com.example.tmdbClient.presentation.di.core

import android.content.Context
import com.example.tmdbClient.presentation.di.artist.ArtistSubComponent
import com.example.tmdbClient.presentation.di.movie.MovieSubComponent
import com.example.tmdbClient.presentation.di.tvShow.TvShowSubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [MovieSubComponent::class,TvShowSubComponent::class,ArtistSubComponent::class])
class AppModule(private val context: Context) {

    @Singleton
    @Provides
    fun provideApplicationContext():Context{
        return context.applicationContext
    }

}