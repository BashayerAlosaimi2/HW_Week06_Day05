package com.sumaya.hw_week06_day05

data class Result (
    val poster_path : String,
    val release_date : String,
    val title : String,
    val vote_average : Double,
)

data class MoviesData (
    val results : List<Result>,
)