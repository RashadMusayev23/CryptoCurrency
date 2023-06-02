package com.mazeppa.cryptocurrency.data.remote.dto.coin_detail


import com.google.gson.annotations.SerializedName

data class Stats(
    @SerializedName("contributors")
    val contributors: Int,
    @SerializedName("followers")
    val followers: Int,
    @SerializedName("members")
    val members: Int,
    @SerializedName("stars")
    val stars: Int,
    @SerializedName("subscribers")
    val subscribers: Int
)