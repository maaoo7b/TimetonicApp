package com.maodev.timetonicapp.data

import com.maodev.timetonicapp.data.model.appkey.CreateAppkey
import com.maodev.timetonicapp.data.model.authkey.CreateAuthKey
import com.maodev.timetonicapp.data.model.books.APIResponse
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.POST
import retrofit2.http.Query

interface APIService {

    companion object {
        val instance = Retrofit.Builder().baseUrl("https://timetonic.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient.Builder().build())
            .build().create(APIService::class.java)
    }

    @POST("live/api.php?req=createAppkey&appname=timetonicApp")
    suspend fun createAppkey(): CreateAppkey

    @POST("live/api.php?req=createOauthkey")
    suspend fun createAuthKey(
        @Query("login") login: String,
        @Query("pwd") pwd: String,
        @Query("appkey") appkey: String
    ): CreateAuthKey

    @POST("live/api.php?version=6.49q/6.49&req=getAllBooks")
    suspend fun getAllBooks(
        @Query("u_c") u_c: String,
        @Query("o_u") o_u: String,
        @Query("sesskey") sesskey: String,
    ): APIResponse
}