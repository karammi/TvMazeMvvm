package com.asad.tvmazemvvm.utils

object Utility {

    fun getGenres(geners: List<String>): String {
        var responseGenre = ""
        geners.forEach { currentGenre ->
            responseGenre += currentGenre + ", "
        }
        return responseGenre.substring(0, responseGenre.length - 2)
    }
}