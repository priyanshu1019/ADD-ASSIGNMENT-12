package com.example.add_assignment_12

import retrofit2.Call
import retrofit2.http.GET

interface MyApi {
    @GET("comments")
    fun getComments(): Call<List<Comments>>
}