package com.example.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.domain.model.Players
import com.example.presentation.databinding.ItemPlayersBinding

class PlayersAdapter(private val onItemClick: (Players) -> Unit):ListAdapter<Players, PlayersAdapter.PlayersViewHolder>(PlayersDiffutil()) {

    inner class PlayersViewHolder(val binding: ItemPlayersBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: Players) {
            binding.tvPlayers.text = model.name
            Glide.with(binding.root)
                .load(model.img)
                .into(binding.imgAvatarPlayer)
            itemView.setOnClickListener {
                onItemClick(model)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayersViewHolder {
        return PlayersViewHolder(ItemPlayersBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: PlayersViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class PlayersDiffutil:DiffUtil.ItemCallback<Players>() {
    override fun areItemsTheSame(oldItem: Players, newItem: Players): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Players, newItem: Players): Boolean {
        return oldItem == newItem
    }
}