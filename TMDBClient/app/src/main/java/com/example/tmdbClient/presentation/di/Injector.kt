package com.example.tmdbClient.presentation.di


import com.example.tmdbClient.presentation.di.artist.ArtistSubComponent
import com.example.tmdbClient.presentation.di.movie.MovieSubComponent
import com.example.tmdbClient.presentation.di.tvShow.TvShowSubComponent

interface Injector {
    fun createMovieSubComponent() : MovieSubComponent
    fun createArtistSubComponent() : ArtistSubComponent
    fun createTvShowSubComponent() : TvShowSubComponent
}