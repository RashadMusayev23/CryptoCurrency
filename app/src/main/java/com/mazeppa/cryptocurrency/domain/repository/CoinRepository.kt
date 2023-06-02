package com.mazeppa.cryptocurrency.domain.repository

import com.mazeppa.cryptocurrency.data.remote.dto.coin.CoinDto
import com.mazeppa.cryptocurrency.data.remote.dto.coin_detail.CoinDetailDto

/**
 * Rashad Musayev on 6/2/2023 - 16:24
 */
interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(id: String) : CoinDetailDto

}