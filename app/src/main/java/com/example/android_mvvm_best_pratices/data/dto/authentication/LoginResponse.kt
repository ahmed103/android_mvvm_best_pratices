package com.example.android_mvvm_best_pratices.data.dto.authentication

data class LoginResponse(

    var token: String = "",


    var roles: List<String> = listOf(),
    var bearer: String = "",


    )