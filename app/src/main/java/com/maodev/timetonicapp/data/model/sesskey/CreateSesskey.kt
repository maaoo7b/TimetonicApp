package com.maodev.timetonicapp.data.model.sesskey


import com.google.gson.annotations.SerializedName

data class CreateSesskey(
    @SerializedName("appName")
    val appName: String,
    @SerializedName("createdVNB")
    val createdVNB: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("req")
    val req: String,
    @SerializedName("restrictions")
    val restrictions: Restrictions,
    @SerializedName("sesskey")
    val sesskey: String,
    @SerializedName("status")
    val status: String
)