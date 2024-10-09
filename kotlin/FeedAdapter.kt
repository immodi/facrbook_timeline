package com.client.routeapplication.feed

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.client.routeapplication.R
import com.client.routeapplication.model.PostDM

class FeedAdapter(private val posts: ArrayList<PostDM>) : Adapter<FeedAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : ViewHolder(itemView){
        var userName: TextView = itemView.findViewById(R.id.username)
        val date: TextView = itemView.findViewById(R.id.postDate)
        val content: TextView = itemView.findViewById(R.id.text)
        val likes: TextView = itemView.findViewById(R.id.like_count)
        val shares: TextView = itemView.findViewById(R.id.share_times_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_post, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val post = posts[position]
        holder.userName.text = post.userName
        holder.date.text = post.date
        holder.content.text = post.content
        holder.likes.text = post.likes.toString()
        "${post.shares} Share(s)".also { holder.shares.text = it }
    }

    override fun getItemCount(): Int = posts.size
}