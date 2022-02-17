package com.example.android_mvvm_best_pratices.data

// A generic class that contains data and status about loading this data.
sealed class Resource<T>(val data: T? = null, val error: Int? = null, val message: String? = null) {

    class Success<T>(data: T) : Resource<T>(data = data)
    class InternetError<T>(error: Int?, message: String?) : Resource<T>(error = error, message = message)
    class ServerError<T>(error: Int?, message: String?) : Resource<T>(error = error, message = message)


}