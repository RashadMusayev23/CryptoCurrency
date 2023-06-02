package com.mazeppa.cryptocurrency.data.repository

import com.mazeppa.cryptocurrency.data.remote.CoinPaprikaApi
import com.mazeppa.cryptocurrency.data.remote.dto.coin.CoinDto
import com.mazeppa.cryptocurrency.data.remote.dto.coin_detail.CoinDetailDto
import com.mazeppa.cryptocurrency.domain.repository.CoinRepository
import javax.inject.Inject

/**
 * Rashad Musayev on 6/2/2023 - 16:28
 */

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

}