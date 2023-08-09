package com.example.getdata.data.repository

import com.example.getdata.data.model.character
import com.example.getdata.data.remote.RetrofitInstance
import retrofit2.Response

class CharacterRepository {
    suspend fun getPosts(): ArrayList<Response<character>> = RetrofitInstance.api.getCharacter()
}