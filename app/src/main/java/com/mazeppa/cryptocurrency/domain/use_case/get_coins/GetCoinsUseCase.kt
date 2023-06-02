package com.mazeppa.cryptocurrency.domain.use_case.get_coins

import com.mazeppa.cryptocurrency.common.Resource
import com.mazeppa.cryptocurrency.data.remote.dto.coin.toCoin
import com.mazeppa.cryptocurrency.data.repository.CoinRepositoryImpl
import com.mazeppa.cryptocurrency.domain.model.Coin
import com.mazeppa.cryptocurrency.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

/**
 * Rashad Musayev on 6/2/2023 - 16:39
 */
class GetCoinsUseCase @Inject constructor(
    //You should use interface, not CoinRepositoryImpl implementation class, because this makes it
    //replaceable
    private val repository: CoinRepository
) {

//    private val repository: CoinRepository = CoinRepositoryImpl()

    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())

            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success(coins))

        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Could not reach server. Check your internet connection."))
        }
    }

}