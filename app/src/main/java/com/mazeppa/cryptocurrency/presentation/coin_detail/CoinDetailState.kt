package com.mazeppa.cryptocurrency.presentation.coin_detail

import com.mazeppa.cryptocurrency.domain.model.CoinDetail

/**
 * Rashad Musayev on 6/2/2023 - 21:14
 */
data class CoinDetailState(
    val isLoading : Boolean = false,
    val coinDetail: CoinDetail? = null,
    val error: String = ""
)
