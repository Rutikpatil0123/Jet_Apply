package com.example.jetapply.sign_In

data class SignInResult(
    val data: UserData?,
    val errorMessage: String?
)

data class UserData(
    val userId : String,
    val userName: String?,
    val profilePictureUrl : String?
)