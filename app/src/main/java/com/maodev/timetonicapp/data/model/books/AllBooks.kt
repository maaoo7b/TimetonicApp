package com.maodev.timetonicapp.data.model.books


import com.google.gson.annotations.SerializedName

data class AllBooks(
    @SerializedName("books")
    val books: List<Book>,
    @SerializedName("contacts")
    val contacts: List<Any>,
    @SerializedName("nbBooks")
    val nbBooks: Int,
    @SerializedName("nbContacts")
    val nbContacts: Int
)