package com.example.getdata.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.getdata.data.repository.CharacterRepository

class MainViewModelFactory (private val repository: CharacterRepository) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CharacterViewModel(repository)as T
    }
}