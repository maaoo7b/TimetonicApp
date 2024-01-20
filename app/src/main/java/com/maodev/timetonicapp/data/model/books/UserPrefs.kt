package com.maodev.timetonicapp.data.model.books


import com.google.gson.annotations.SerializedName

data class UserPrefs(
    @SerializedName("inGlobalSearch")
    val inGlobalSearch: Boolean,
    @SerializedName("inGlobalTasks")
    val inGlobalTasks: Boolean,
    @SerializedName("maxMsgsOffline")
    val maxMsgsOffline: Int,
    @SerializedName("notificationEnabled")
    val notificationEnabled: String,
    @SerializedName("notifyEmailCopy")
    val notifyEmailCopy: Boolean,
    @SerializedName("notifyMobile")
    val notifyMobile: Boolean,
    @SerializedName("notifySmsCopy")
    val notifySmsCopy: Boolean,
    @SerializedName("notifyWhenMsgInArchivedBook")
    val notifyWhenMsgInArchivedBook: Boolean,
    @SerializedName("syncWithHubic")
    val syncWithHubic: Boolean,
    @SerializedName("uCoverColor")
    val uCoverColor: String,
    @SerializedName("uCoverImg")
    val uCoverImg: String,
    @SerializedName("uCoverLetOwnerDecide")
    val uCoverLetOwnerDecide: Boolean,
    @SerializedName("uCoverType")
    val uCoverType: String,
    @SerializedName("uCoverUseLastImg")
    val uCoverUseLastImg: Boolean
)