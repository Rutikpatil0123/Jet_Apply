package com.example.jetapply.sign_In

data class SignInState(
    val isSignInSuccessful : Boolean = false,
    val signInError: String? = null
)
