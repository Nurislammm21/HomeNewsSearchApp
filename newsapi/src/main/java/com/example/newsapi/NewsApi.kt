package com.example.newsapi

import retrofit2.http.GET

interface NewsApi {


    @GET()
    fun everything()
}