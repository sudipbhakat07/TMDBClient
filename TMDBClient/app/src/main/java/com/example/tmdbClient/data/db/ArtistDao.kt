package com.example.tmdbClient.data.db

import androidx.room.*
import com.example.tmdbClient.data.model.artist.Artist

@Dao
interface  ArtistDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveArtists(artists : List<Artist>)

    @Query("DELETE FROM popular_artists")
    suspend fun deleteAllArtists()

    @Query("SELECT * FROM popular_artists")
    suspend fun getArtists():List<Artist>
}