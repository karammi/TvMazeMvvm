package com.asad.tvmazemvvm.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.asad.tvmazemvvm.R
import com.asad.tvmazemvvm.models.Show
import com.asad.tvmazemvvm.utils.Utility

class ShowAdapter : ListAdapter<Show, ShowAdapter.ShowViewHolder>(DIFF_SHOW_UTIL) {

    var movieSelectListener: MovieSelectListener? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowViewHolder =
        ShowViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_show,
                parent,
                false
            )
        )


    override fun onBindViewHolder(holder: ShowViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ShowViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val llShow: LinearLayout = view.findViewById(R.id.llShow)
        val tvMovieName: TextView = view.findViewById(R.id.tvMovieName)
        val tvRating: TextView = view.findViewById(R.id.tvRating)
        val tvGenre: TextView = view.findViewById(R.id.tvGenre)
        val tvLanguage: TextView = view.findViewById(R.id.tvLanguage)
        val tvStatus: TextView = view.findViewById(R.id.tvStatus)
        val tvRunTime: TextView = view.findViewById(R.id.tvRunTime)

        init {
            llShow.setOnClickListener {
                movieSelectListener?.onMovieClick(getItem(adapterPosition))
            }
        }

        fun bind(currentShow: Show) {
            tvMovieName.text = currentShow.name
            tvRating.text = currentShow.rating.toString()
            tvGenre.text = Utility.getGenres(currentShow.geners)
            tvLanguage.text = currentShow.language
            tvStatus.text = currentShow.status
            tvRunTime.text = currentShow.runtime.toString()

        }
    }

}


val DIFF_SHOW_UTIL = object : DiffUtil.ItemCallback<Show>() {
    override fun areItemsTheSame(oldItem: Show, newItem: Show): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Show, newItem: Show): Boolean {
        return oldItem == newItem
    }
}