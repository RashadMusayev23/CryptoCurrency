package com.mazeppa.cryptocurrency.domain.use_case

import com.mazeppa.cryptocurrency.common.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

/**
 * Rashad Musayev on 6/2/2023 - 17:10
 */
abstract class BaseUseCase<T> {

    abstract suspend fun getResult() :T

    operator fun invoke(): Flow<Resource<T>> = flow {
        try {
            emit(Resource.Loading())

            val result = getResult()
            emit(Resource.Success(result))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Could not reach server. Check your internet connection."))
        }
    }
}
