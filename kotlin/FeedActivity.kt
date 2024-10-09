package com.client.routeapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.util.rangeTo
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.client.routeapplication.feed.FeedAdapter
import com.client.routeapplication.model.PostDM

class FeedActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FeedAdapter

    private var posts = ArrayList<PostDM>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_feed)
        mockPosts()
        recyclerView = findViewById(R.id.recycler_view)
        adapter = FeedAdapter(posts)

        recyclerView.adapter = adapter
    }

    private fun mockPosts() {
        for (i: Int in 0 ..10) {
            posts.add(
                PostDM(
                    userName = "User$i",
                    content = "Content ".repeat(i),
                    likes = i,
                    shares = i+1,
                    date = "$i hrs - "
                )
            )
        }
    }
}