package com.example.tmdbClient.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tmdbClient.data.model.artist.Artist
import com.example.tmdbClient.data.model.movie.Movie
import com.example.tmdbClient.data.model.tvShow.TvShow

@Database(entities = [Movie::class, TvShow::class, Artist::class],
    version = 1,
    exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase(){
    abstract fun movieDao(): MovieDao
    abstract fun tvDao(): TvShowDao
    abstract fun artistDao(): ArtistDao

}
