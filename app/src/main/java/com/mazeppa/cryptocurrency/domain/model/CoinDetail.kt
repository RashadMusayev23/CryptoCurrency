package com.mazeppa.cryptocurrency.domain.model

import com.mazeppa.cryptocurrency.data.remote.dto.coin_detail.TeamMember

/**
 * Rashad Musayev on 6/2/2023 - 11:35
 */
data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val logo: String,
    val tags: List<String>,
    val team: List<TeamMember>,
)
