package com.maodev.timetonicapp.data.model.books


import com.google.gson.annotations.SerializedName

data class Book(
    @SerializedName("accepted")
    val accepted: Boolean,
    @SerializedName("archived")
    val archived: Boolean,
    @SerializedName("b_c")
    val bC: String,
    @SerializedName("b_o")
    val bO: String,
    @SerializedName("canDisableSync")
    val canDisableSync: Boolean,
    @SerializedName("cluster")
    val cluster: String,
    @SerializedName("contact_u_c")
    val contactUC: Any?,
    @SerializedName("defaultTemplate")
    val defaultTemplate: String,
    @SerializedName("del")
    val del: Boolean,
    @SerializedName("description")
    val description: String?,
    @SerializedName("favorite")
    val favorite: Boolean,
    @SerializedName("fpForm")
    val fpForm: FpForm,
    @SerializedName("hideBookMembers")
    val hideBookMembers: String,
    @SerializedName("hideMessage")
    val hideMessage: String,
    @SerializedName("invited")
    val invited: Boolean,
    @SerializedName("isDownloadable")
    val isDownloadable: Boolean,
    @SerializedName("langs")
    val langs: Any?,
    @SerializedName("lastMedia")
    val lastMedia: Int,
    @SerializedName("lastMsg")
    val lastMsg: LastMsg,
    @SerializedName("lastMsgRead")
    val lastMsgRead: Int,
    @SerializedName("members")
    val members: List<Member>,
    @SerializedName("nbMembers")
    val nbMembers: Int,
    @SerializedName("nbMsgs")
    val nbMsgs: Int,
    @SerializedName("nbNotRead")
    val nbNotRead: Int,
    @SerializedName("notificationAudio")
    val notificationAudio: String,
    @SerializedName("notificationWeb")
    val notificationWeb: String,
    @SerializedName("order")
    val order: Int,
    @SerializedName("ownerPrefs")
    val ownerPrefs: OwnerPrefs,
    @SerializedName("sbid")
    val sbid: Int,
    @SerializedName("showFpOnOpen")
    val showFpOnOpen: Boolean,
    @SerializedName("sstamp")
    val sstamp: Long,
    @SerializedName("tags")
    val tags: Any?,
    @SerializedName("userPrefs")
    val userPrefs: UserPrefs
)