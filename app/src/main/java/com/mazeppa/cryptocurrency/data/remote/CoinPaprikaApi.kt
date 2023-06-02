package com.mazeppa.cryptocurrency.data.remote

import com.mazeppa.cryptocurrency.data.remote.dto.coin.CoinDto
import com.mazeppa.cryptocurrency.data.remote.dto.coin_detail.CoinDetailDto
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Rashad Musayev on 6/2/2023 - 11:14
 */
interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") id: String): CoinDetailDto

}