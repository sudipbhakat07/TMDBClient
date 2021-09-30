package com.example.tmdbClient.presentation.tvShow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.tmdbClient.R
import com.example.tmdbClient.databinding.ActivityTvshowBinding

class TvShowActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTvshowBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_tvshow)
    }
}