package com.mazeppa.cryptocurrency.presentation.coin_list

import com.mazeppa.cryptocurrency.domain.model.Coin

/**
 * Rashad Musayev on 6/2/2023 - 21:04
 */

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)