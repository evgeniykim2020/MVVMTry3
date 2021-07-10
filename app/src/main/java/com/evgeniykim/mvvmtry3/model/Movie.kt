package com.evgeniykim.mvvmtry3.model



import androidx.annotation.Keep


data class Movie(
    var category: String = "",
    var desc: String = "",
    var imageUrl: String = "",
    var name: String = ""
)