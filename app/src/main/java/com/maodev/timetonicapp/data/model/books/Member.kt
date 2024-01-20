package com.maodev.timetonicapp.data.model.books


import com.google.gson.annotations.SerializedName

data class Member(
    @SerializedName("access")
    val access: Int,
    @SerializedName("apiRight")
    val apiRight: String,
    @SerializedName("hideBookMembers")
    val hideBookMembers: String,
    @SerializedName("hideMessage")
    val hideMessage: String,
    @SerializedName("invite")
    val invite: String,
    @SerializedName("right")
    val right: Int,
    @SerializedName("u_c")
    val uC: String
)