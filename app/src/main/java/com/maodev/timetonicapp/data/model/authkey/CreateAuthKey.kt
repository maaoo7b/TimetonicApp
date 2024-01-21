package com.maodev.timetonicapp.data.model.authkey


import com.google.gson.annotations.SerializedName

data class CreateAuthKey(
    @SerializedName("createdVNB")
    val createdVNB: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("o_u")
    val oU: String,
    @SerializedName("oauthkey")
    val oauthkey: String,
    @SerializedName("req")
    val req: String,
    @SerializedName("status")
    val status: String
)