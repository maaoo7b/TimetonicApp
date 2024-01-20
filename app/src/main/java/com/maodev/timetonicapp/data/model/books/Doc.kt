package com.maodev.timetonicapp.data.model.books


import com.google.gson.annotations.SerializedName

data class Doc(
    @SerializedName("del")
    val del: Boolean,
    @SerializedName("ext")
    val ext: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("internName")
    val internName: String,
    @SerializedName("originName")
    val originName: String,
    @SerializedName("size")
    val size: Int,
    @SerializedName("type")
    val type: String,
    @SerializedName("uuid")
    val uuid: String
)