package com.jenyasubbotina.bookexchanger.android.network

import com.jenyasubbotina.bookexchanger.android.local.Storage
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkService(private val storage: Storage) {

    private fun getClient(): OkHttpClient {
        val token = storage.get("token")
        return OkHttpClient.Builder().apply {
            addInterceptor { chain ->
                val newRequest = chain.request().newBuilder()
                    .addHeader("Authorization", "Bearer $token")
                    .build()
                chain.proceed(newRequest)
            }
        }.build()
    }

    val api: ApiInterface by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(getClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)
    }

    companion object {
        private const val BASE_URL = ""
    }
}