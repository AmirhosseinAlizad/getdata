package com.example.getdata.data.remote

import com.example.getdata.data.model.character
import com.example.getdata.utils.Constance
import retrofit2.Response
import retrofit2.http.GET

interface SimpleApi {
    @GET(value = Constance.END_POINT)
    suspend fun getCharacter(): ArrayList<Response<character>>
}