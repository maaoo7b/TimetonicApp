package com.maodev.timetonicapp.data.model.sesskey


import com.google.gson.annotations.SerializedName

data class Restrictions(
    @SerializedName("carnet_code")
    val carnetCode: Any?,
    @SerializedName("carnet_owner")
    val carnetOwner: Any?,
    @SerializedName("hideEvents")
    val hideEvents: Boolean,
    @SerializedName("hideMessages")
    val hideMessages: Boolean,
    @SerializedName("hideTables")
    val hideTables: Boolean,
    @SerializedName("internal")
    val `internal`: Boolean,
    @SerializedName("readonly")
    val readonly: Boolean
)