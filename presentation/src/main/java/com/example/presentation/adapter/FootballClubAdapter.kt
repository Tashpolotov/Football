package com.example.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.domain.model.ClubName
import com.example.presentation.databinding.ItemFootballClubBinding

class FootballClubAdapter(private val onItemClick: (ClubName) -> Unit) : ListAdapter<ClubName, FootballClubAdapter.FootballClubViewHolder>(ClubDetailDiffUtil()) {

    inner class FootballClubViewHolder(private val binding: ItemFootballClubBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(club: ClubName) {
            binding.tvClubName.text = club.name
            Glide.with(binding.root)
                .load(club.img)
                .into(binding.imgClubAvatar)
            itemView.setOnClickListener {
                onItemClick(club)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FootballClubViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemFootballClubBinding.inflate(inflater, parent, false)
        return FootballClubViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FootballClubViewHolder, position: Int) {
        val club = getItem(position)
        holder.bind(club)
    }
}
class ClubDetailDiffUtil : DiffUtil.ItemCallback<ClubName>() {
    override fun areItemsTheSame(oldItem: ClubName, newItem: ClubName): Boolean {
        return oldItem.name == newItem.name
    }
    override fun areContentsTheSame(oldItem: ClubName, newItem: ClubName): Boolean {
        return oldItem == newItem
    }
}