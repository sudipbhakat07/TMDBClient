package com.example.tmdbClient.presentation.di.tvShow

import com.example.tmdbClient.presentation.tvShow.TvShowActivity
import dagger.Subcomponent
@TvShowScope
@Subcomponent(modules = [TvShowModule :: class])
interface TvShowSubComponent {
    fun inject(tvShowActivity: TvShowActivity)

    @Subcomponent.Factory
    interface  Factory {
        fun create() : TvShowSubComponent
    }
}