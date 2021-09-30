package com.example.tmdbClient.data.repository.movie

import android.util.Log
import com.example.tmdbClient.data.model.movie.Movie
import com.example.tmdbClient.data.model.movie.MovieList
import com.example.tmdbClient.data.repository.movie.dataSorce.MovieCacheDataSource
import com.example.tmdbClient.data.repository.movie.dataSorce.MovieLocalDataSource
import com.example.tmdbClient.data.repository.movie.dataSorce.MovieRemoteDataSource
import com.example.tmdbClient.domain.repository.MovieRepository
import java.lang.Exception

class MovieRepositoryImpl(
    private val movieRemoteDatasource: MovieRemoteDataSource,
    private val movieLocalDataSource: MovieLocalDataSource,
    private val movieCacheDataSource: MovieCacheDataSource
) : MovieRepository {
    override suspend fun getMovies(): List<Movie>? {
        return getMoviesFromCache()
    }

    override suspend fun updateMovies(): List<Movie>? {
        val newListOfMovies = getMoviesFromAPI()
        movieLocalDataSource.clearAll()
        movieLocalDataSource.saveMoviesToDB(newListOfMovies)
        movieCacheDataSource.saveMoviesToCache(newListOfMovies)
        return newListOfMovies
    }

    suspend fun getMoviesFromAPI(): List<Movie> {
        lateinit var movieList: List<Movie>
        try {
            val response = movieRemoteDatasource.getMovies()
            val body : MovieList? = response.body()
            if(body!=null){
                movieList = body.movies
            }
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        return movieList
    }

    suspend fun getMoviesFromDB():List<Movie>{
        lateinit var movieList: List<Movie>
        try {
            movieList = movieLocalDataSource.getMoviesFromDB()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if(movieList.size>0){
            return movieList
        }else{
            movieList=getMoviesFromAPI()
            movieLocalDataSource.saveMoviesToDB(movieList)
        }

        return movieList
    }

    suspend fun getMoviesFromCache():List<Movie>{
        lateinit var movieList: List<Movie>
        try {
            movieList =movieCacheDataSource.getMoviesFromCache()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if(movieList.size>0){
            return movieList
        }else{
            movieList=getMoviesFromDB()
            movieCacheDataSource.saveMoviesToCache(movieList)
        }

        return movieList
    }

}