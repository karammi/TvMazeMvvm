package com.asad.tvmazemvvm.view

import com.asad.tvmazemvvm.models.Show

interface MovieSelectListener {
    fun onMovieClick(currentMovie: Show)
}