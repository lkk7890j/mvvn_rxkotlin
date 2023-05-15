package com.example.mvvn.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvvn.bean.PhotoBean
import com.example.mvvn.databinding.CellPhotoBinding

class PhotoAdapter
    (private var mContext: Context,
     var listPhoto: PhotoBean) : RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {



    class ViewHolder(val binding: CellPhotoBinding) :
        RecyclerView.ViewHolder(binding.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            CellPhotoBinding.inflate(
                LayoutInflater.from(
                    parent.context
                )
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(holder.itemView)
            .load(listPhoto[position].thumbnailUrl)
            .into(holder.binding.photoImage)

        holder.binding.id.text = listPhoto[position].id.toString()
        holder.binding.title.text = listPhoto[position].title
    }

    override fun getItemCount(): Int {
        return listPhoto.size
    }
}