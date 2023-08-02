package com.example.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.domain.model.PlayerModel
import com.example.presentation.databinding.ItemPlayerDetailsBinding

class PlayerDetailAdapter:ListAdapter<PlayerModel, PlayerDetailAdapter.PlayerDetailViewHolder>(PlayerDetailDiffutil()) {

    inner class PlayerDetailViewHolder(val binding: ItemPlayerDetailsBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(model: PlayerModel) {
            binding.tvPlayersName.text = "Имя футболиста: ${model.name}"
            binding.tvPosition.text = "Позиция на поле: ${model.position}"
            binding.tvPlayerNumber.text = "Номер: ${model.number}"
            binding.tvGoal.text = "Голы за сезон: ${model.goal}"
            binding.tvCountry.text = "Гражданство: ${model.country}"
            binding.tvGamePlay.text = "Сыграл игр за сезон: ${model.game}"
            Glide.with(binding.root)
                .load(model.img)
                .into(binding.imgPlayer)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerDetailViewHolder {
        return PlayerDetailViewHolder(ItemPlayerDetailsBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: PlayerDetailViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class PlayerDetailDiffutil: DiffUtil.ItemCallback<PlayerModel>() {
    override fun areItemsTheSame(oldItem: PlayerModel, newItem: PlayerModel): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: PlayerModel, newItem: PlayerModel): Boolean {
        return oldItem == newItem
    }
}