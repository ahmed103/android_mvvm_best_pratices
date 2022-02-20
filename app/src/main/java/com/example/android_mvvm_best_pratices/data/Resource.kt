package com.example.android_mvvm_best_pratices.data

import android.view.View

// A generic class that contains data and status about loading this data.
sealed class Resource<T>(
    val data: T? = null,
    val error: Int? = null,
    val message: String? = null,
    val loading: Boolean = false,
    val idle: Boolean = false
) {

    class Success<T>(data: T) : Resource<T>(data = data)
    class Loading<T> : Resource<T>(loading = true)
    class InternetError<T>(error: Int?, message: String?) :
        Resource<T>(error = error, message = message)

    class ServerError<T>(error: Int?, message: String?) :
        Resource<T>(error = error, message = message)

    class Idle<T>(message: String) : Resource<T>(idle = true, message = message)


}