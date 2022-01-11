package net.verybestmobile.tvshowmvvmyt.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import net.verybestmobile.tvshowmvvmyt.databinding.RowItemBinding
import net.verybestmobile.tvshowmvvmyt.model.TVShow

class TVShowAdapter: ListAdapter<TVShow, TVShowAdapter.TVShowViewHolder>(DiffCallback()) {
    class DiffCallback: DiffUtil.ItemCallback<TVShow>() {
        override fun areItemsTheSame(oldItem: TVShow, newItem: TVShow) = oldItem.name == newItem.name
        override fun areContentsTheSame(oldItem: TVShow, newItem: TVShow) = oldItem == newItem
    }

    class TVShowViewHolder(private val binding: RowItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShow: TVShow){
            binding.tvShow = tvShow
            binding.executePendingBindings()
            binding.imageView.setOnClickListener {
                Toast.makeText(itemView.context, "${tvShow.name}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TVShowViewHolder {
        return TVShowViewHolder(RowItemBinding.inflate(LayoutInflater.from(parent.context),
        parent, false))
    }

    override fun onBindViewHolder(holder: TVShowViewHolder, position: Int) {
        val tvShow = getItem(position)
        holder.bind(tvShow)
    }
}