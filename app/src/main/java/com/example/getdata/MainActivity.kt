package com.example.getdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.getdata.data.repository.CharacterRepository
import com.example.getdata.databinding.ActivityMainBinding
import com.example.getdata.ui.adapter.CharacterAdapter
import com.example.getdata.ui.viewmodel.CharacterViewModel
import com.example.getdata.ui.viewmodel.MainViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: CharacterViewModel
    private lateinit var binding: ActivityMainBinding
    private val characterAdapter by lazy { CharacterAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        bindViews()
    }

    private fun bindViews() {
        val repository = CharacterRepository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory)[CharacterViewModel::class.java]
       // viewModel.characterResponse.observe(this) { response ->
          //  if (response.isSuccessful)
               // response.body()?.let { characterAdapter.setData(it) }
         //   else
          //      Toast.makeText(this, response.code(), Toast.LENGTH_SHORT).show()

      //  }
    }
}