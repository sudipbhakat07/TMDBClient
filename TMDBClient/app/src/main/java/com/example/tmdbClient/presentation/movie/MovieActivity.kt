package com.example.tmdbClient.presentation.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.tmdbClient.R
import com.example.tmdbClient.databinding.ActivityMovieBinding
import com.example.tmdbClient.presentation.di.Injector
import javax.inject.Inject

class MovieActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: MovieViewModelFactory
    lateinit var movieBinding: ActivityMovieBinding
    lateinit var movieViewModel: MovieViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        movieBinding = DataBindingUtil.setContentView(this,R.layout.activity_movie)
        (application as Injector).createMovieSubComponent().inject(this)

        movieViewModel = ViewModelProvider(this,factory)[MovieViewModel::class.java]
        val responsiveData = movieViewModel.getMovies().observe(this, Observer {
            Log.i("MYTAG",it.toString())
        })
    }
}