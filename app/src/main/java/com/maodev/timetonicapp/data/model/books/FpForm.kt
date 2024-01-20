package com.maodev.timetonicapp.data.model.books


import com.google.gson.annotations.SerializedName

data class FpForm(
    @SerializedName("fpid")
    val fpid: Int,
    @SerializedName("lastModified")
    val lastModified: Int,
    @SerializedName("name")
    val name: String
)