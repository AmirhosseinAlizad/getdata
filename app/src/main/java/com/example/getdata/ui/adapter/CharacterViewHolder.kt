package com.example.getdata.ui.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.getdata.data.model.character
import com.example.getdata.databinding.CharacterItemBinding
import com.squareup.picasso.Picasso

class CharacterViewHolder(private val binding: CharacterItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bindViews(model: character) {
        binding.apply {
           binding.text.text = model.name
            Picasso.get().load(model.image).into(image);
        }
    }
}