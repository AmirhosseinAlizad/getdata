package com.example.getdata.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.getdata.data.model.character
import com.example.getdata.data.repository.CharacterRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class CharacterViewModel(private val repository: CharacterRepository) : ViewModel() {
    val characterResponse: MutableLiveData<ArrayList<Response<character>>> = MutableLiveData()
    fun getCharacters() {
        viewModelScope.launch {
            val response: ArrayList<Response<character>> = repository.getPosts()
            characterResponse.value = response
        }
    }
}