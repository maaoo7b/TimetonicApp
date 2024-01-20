package com.maodev.timetonicapp.data.model.repository

import com.maodev.timetonicapp.data.APIService
import com.maodev.timetonicapp.data.model.books.BookMapper
import com.maodev.timetonicapp.data.model.books.OwnerPrefs

class BooksRepository(private val apiService: APIService) {

    suspend fun getAllBooks(): Result<List<BookMapper>> {
        return try {
            val response = apiService.getAllBooks(
                "androiddeveloper",
                "androiddeveloper",
                "MDRy-pby6-Gnhn-D3W5-pnqA-DIk7-qVzQ"
            ).allBooks.books
            val book = response.map { converter(it.ownerPrefs) }
            Result.success(book)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    private fun converter(ownerPrefs: OwnerPrefs): BookMapper {
        return BookMapper(ownerPrefs.title, "https://timetonic.com/" + ownerPrefs.oCoverImg)
    }
}