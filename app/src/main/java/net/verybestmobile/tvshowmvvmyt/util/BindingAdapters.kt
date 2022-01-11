package net.verybestmobile.tvshowmvvmyt.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import net.verybestmobile.tvshowmvvmyt.adapter.TVShowAdapter
import net.verybestmobile.tvshowmvvmyt.model.TVShow

@BindingAdapter("bindImage")
fun bindImage(imageView: ImageView, url: String){
    imageView.load(url){
        crossfade(true)
        crossfade(1000)
    }
}

@BindingAdapter("bindData")
fun bindData(recyclerView: RecyclerView, data: List<TVShow>?){
    val adapter = recyclerView.adapter as TVShowAdapter
    adapter.submitList(data)
}