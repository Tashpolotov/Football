package com.example.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.domain.model.ClubDetailModel
import com.example.presentation.databinding.ItemClubsInfoBinding

class ClubsInfoAdapter(private val onItemClick: (ClubDetailModel) -> Unit):ListAdapter<ClubDetailModel, ClubsInfoAdapter.ClubsInfoViewHolder>(ClubsInfoDiffutil()) {
    inner class ClubsInfoViewHolder(val binding: ItemClubsInfoBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: ClubDetailModel) {
            binding.tvCountry.text = "Страна: ${model.country}"
            binding.tvNameClub.text = "Название клуба: ${model.name}"
            binding.tvStadium.text = "Название стадиона: ${model.stadium}"
            binding.tvPlayers.text = "${model.players} : Игрока в команде"
            Glide.with(binding.root)
                .load(model.img)
                .into(binding.imgAvatar)
            Glide.with(binding.root)
                .load(model.stadiumImg)
                .into(binding.imgStadium)
            binding.tvPlayers.setOnClickListener {
                onItemClick(model)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClubsInfoViewHolder {
        return ClubsInfoViewHolder(ItemClubsInfoBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ClubsInfoViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class ClubsInfoDiffutil:DiffUtil.ItemCallback<ClubDetailModel>() {
    override fun areItemsTheSame(oldItem: ClubDetailModel, newItem: ClubDetailModel): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: ClubDetailModel, newItem: ClubDetailModel): Boolean {
        return oldItem == newItem
    }
}