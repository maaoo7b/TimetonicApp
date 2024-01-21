package com.maodev.timetonicapp.data.model.appkey


import com.google.gson.annotations.SerializedName

data class CreateAppkey(
    @SerializedName("appkey")
    val appkey: String,
    @SerializedName("createdVNB")
    val createdVNB: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("req")
    val req: String,
    @SerializedName("status")
    val status: String
)