package com.maodev.timetonicapp.data.model.books


import com.google.gson.annotations.SerializedName

data class LastMsg(
    @SerializedName("b_c")
    val bC: String,
    @SerializedName("b_o")
    val bO: String,
    @SerializedName("created")
    val created: Int,
    @SerializedName("del")
    val del: Boolean,
    @SerializedName("docs")
    val docs: List<Doc>?,
    @SerializedName("lastCommentId")
    val lastCommentId: Int,
    @SerializedName("lastModified")
    val lastModified: Int,
    @SerializedName("linkMessage")
    val linkMessage: String,
    @SerializedName("linkedFieldId")
    val linkedFieldId: Any?,
    @SerializedName("linkedRowId")
    val linkedRowId: Any?,
    @SerializedName("linkedTabId")
    val linkedTabId: Any?,
    @SerializedName("msg")
    val msg: String,
    @SerializedName("msgBody")
    val msgBody: String,
    @SerializedName("msgColor")
    val msgColor: String,
    @SerializedName("msgMethod")
    val msgMethod: String,
    @SerializedName("msgType")
    val msgType: String,
    @SerializedName("nbComments")
    val nbComments: Int,
    @SerializedName("nbDocs")
    val nbDocs: Int,
    @SerializedName("nbEmailCids")
    val nbEmailCids: Int,
    @SerializedName("nbMedias")
    val nbMedias: Int,
    @SerializedName("pid")
    val pid: Int,
    @SerializedName("smid")
    val smid: Int,
    @SerializedName("sstamp")
    val sstamp: Long,
    @SerializedName("u_c")
    val uC: String,
    @SerializedName("uuid")
    val uuid: String
)