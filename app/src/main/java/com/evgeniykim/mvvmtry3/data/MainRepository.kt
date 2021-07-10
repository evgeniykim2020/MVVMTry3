package com.evgeniykim.mvvmtry3.data

import com.evgeniykim.mvvmtry3.api.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {

    fun getAllMovies() = retrofitService.getAllMovies()
}