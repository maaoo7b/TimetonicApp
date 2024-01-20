package com.maodev.timetonicapp.data

import com.maodev.timetonicapp.data.model.books.BookMapper

data class BookState(
    val isLoading: Boolean = false,
    val book: List<BookMapper> = emptyList()
)
