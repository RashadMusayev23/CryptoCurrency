package com.mazeppa.cryptocurrency.domain.model

import com.google.gson.annotations.SerializedName

/**
 * Rashad Musayev on 6/2/2023 - 11:26
 */
data class Coin(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)
