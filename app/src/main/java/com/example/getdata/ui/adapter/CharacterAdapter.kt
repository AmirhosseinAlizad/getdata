package com.example.getdata.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getdata.data.model.character
import com.example.getdata.databinding.CharacterItemBinding

class CharacterAdapter: RecyclerView.Adapter<CharacterViewHolder>() {
    private var characterList = emptyList<character>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder =
        CharacterViewHolder(
            CharacterItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun getItemCount(): Int {
        return characterList.size
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bindViews(characterList[position])
    }
    fun setData(newList:ArrayList<character>){
        characterList=newList
    }
}