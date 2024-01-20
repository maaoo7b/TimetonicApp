package com.maodev.timetonicapp.data.model.books


import com.google.gson.annotations.SerializedName

data class APIResponse(
    @SerializedName("allBooks")
    val allBooks: AllBooks,
    @SerializedName("createdVNB")
    val createdVNB: String,
    @SerializedName("req")
    val req: String,
    @SerializedName("sstamp")
    val sstamp: Long,
    @SerializedName("status")
    val status: String
)