package com.maodev.timetonicapp.data.model.books


import com.google.gson.annotations.SerializedName

data class OwnerPrefs(
    @SerializedName("acceptExternalMsg")
    val acceptExternalMsg: Boolean,
    @SerializedName("authorizeMemberBroadcast")
    val authorizeMemberBroadcast: Boolean,
    @SerializedName("fpAutoExport")
    val fpAutoExport: Boolean,
    @SerializedName("notifyMobileConfidential")
    val notifyMobileConfidential: Boolean,
    @SerializedName("oCoverColor")
    val oCoverColor: String,
    @SerializedName("oCoverImg")
    val oCoverImg: String,
    @SerializedName("oCoverType")
    val oCoverType: String,
    @SerializedName("oCoverUseLastImg")
    val oCoverUseLastImg: Boolean,
    @SerializedName("title")
    val title: String
)