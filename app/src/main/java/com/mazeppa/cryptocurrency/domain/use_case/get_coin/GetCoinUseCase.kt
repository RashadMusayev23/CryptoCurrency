package com.mazeppa.cryptocurrency.domain.use_case.get_coin

import com.mazeppa.cryptocurrency.common.Resource
import com.mazeppa.cryptocurrency.data.remote.dto.coin_detail.toCoinDetail
import com.mazeppa.cryptocurrency.domain.model.CoinDetail
import com.mazeppa.cryptocurrency.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

/**
 * Rashad Musayev on 6/2/2023 - 16:41
 */
class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository,
) {

    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())

            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Could not reach server. Check your internet connection."))
        }
    }
}