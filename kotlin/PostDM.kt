package com.client.routeapplication.model

data class PostDM(
    val userName: String,
    val date: String,
    val content: String,
    val likes: Int,
    val shares: Int
)
