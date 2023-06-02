package com.mazeppa.cryptocurrency.common

/**
 * Rashad Musayev on 6/2/2023 - 11:11
 */
sealed class Resource<T>(val data: T? = null, val message: String? = null) {

    class Success<T>(data: T) : Resource<T>(data)
    class Loading<T>(data: T? = null) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
}