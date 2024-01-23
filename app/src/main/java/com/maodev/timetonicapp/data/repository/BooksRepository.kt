package com.maodev.timetonicapp.data.repository

import com.maodev.timetonicapp.data.APIService
import com.maodev.timetonicapp.data.model.authkey.CreateAuthKey
import com.maodev.timetonicapp.data.model.books.BookMapper
import com.maodev.timetonicapp.data.model.books.OwnerPrefs
import com.maodev.timetonicapp.data.model.sesskey.CreateSesskey

class BooksRepository(private val apiService: APIService) {

    suspend fun getAllBooks(
        ou: String, uc: String, sesskey: String
    ): Result<List<BookMapper>> {
        return try {
            val response = apiService.getAllBooks(
                ou, uc, sesskey
            ).allBooks.books
            val book = response.map { converter(it.ownerPrefs) }
            Result.success(book)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun getAllBooks(
    ): Result<List<BookMapper>> {
        return try {
            val response = apiService.getAllBooks(
                "androiddeveloper", "androiddeveloper", "MDRy-pby6-Gnhn-D3W5-pnqA-DIk7-qVzQ"
            ).allBooks.books
            val book = response.map { converter(it.ownerPrefs) }
            Result.success(book)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun createAppkey(): String {
        val appkey = apiService.createAppkey().appkey
        return appkey
    }

    suspend fun createAuthKey(login: String, pwd: String): CreateAuthKey {
        val authkey = apiService.createAuthKey(login, pwd, createAppkey())
        return authkey
    }

    suspend fun createSessionkey(o_u: String, u_c: String, authkey: String): CreateSesskey {
        val sesskey = apiService.createSessionkey(o_u, u_c, authkey)
        return sesskey
    }

    private fun converter(ownerPrefs: OwnerPrefs): BookMapper {
        return BookMapper(ownerPrefs.title, "https://timetonic.com/" + ownerPrefs.oCoverImg)
    }
}