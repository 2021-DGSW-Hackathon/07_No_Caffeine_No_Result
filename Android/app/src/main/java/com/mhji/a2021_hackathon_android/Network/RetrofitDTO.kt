package com.mhji.a2021_hackathon_android.Network

data class UserLogin(
    val id: String,
    val pw : String
)

data class brokerLogin(
    val id: String,
    val pw : String
)

data class userSignUp (
    val id : String,
    val pw : String,
    val phoneNumber : String,
)

data class brokerSignUp(
    val id : String,
    val pw : String,
    val phoneNumber: String,
    val city : String,
    val county : String,
    val name : String
)

data class PostAll(
    val city: String,
    val county: String,
    val aptname: String,
    val type: String,
    val price: Int,
    val context : String,
    val attachment : String
)