package com.ardian.android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ardian.android.databinding.ListDatamovieBinding
import com.ardian.android.modeldata.MovieData
import com.bumptech.glide.Glide


/**
 * Created by Ardian Iqbal Yusmartito on 03/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
class MovieAdapter(
    private val listMovie : ArrayList<MovieData>
):RecyclerView.Adapter<MovieAdapter.MovieViewHolder>()  {

    inner class MovieViewHolder(itemView : ListDatamovieBinding) : RecyclerView.ViewHolder(itemView.root){
        private val binding = itemView
        fun bind(movieData: MovieData){
            with(binding){
                Glide.with(itemView).load(movieData.gambar).into(imgPoster)
                tvTittle.text = movieData.Tittle
                tvYear.text = movieData.Year
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(ListDatamovieBinding.inflate(LayoutInflater.from(parent.context), parent
            ,false))
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(listMovie[position])
    }

    override fun getItemCount(): Int = listMovie.size



}