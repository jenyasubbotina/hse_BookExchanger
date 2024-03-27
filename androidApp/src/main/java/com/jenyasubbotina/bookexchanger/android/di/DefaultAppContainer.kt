//package com.jenyasubbotina.bookexchanger.android.di
//
//import com.jenyasubbotina.bookexchanger.android.network.NetworkService
//import com.jenyasubbotina.bookexchanger.android.repository.GenresRepository
//import com.jenyasubbotina.bookexchanger.android.repository.NetworkGenresRepository
//import okhttp3.Interceptor
//import okhttp3.OkHttpClient
//import okhttp3.Request
//import retrofit2.Response
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//import retrofit2.create
//import java.io.IOException
//
//
//class DefaultAppContainer : AppContainer {
//
//    private val BASE_URL = "https://www.googleapis.com/books/v1/"
//
//    var client: OkHttpClient = OkHttpClient.Builder().addInterceptor(object : Interceptor() {
//        @Throws(IOException::class)
//        override fun intercept(chain: Interceptor.Chain): okhttp3.Response {
//            val token = accountManager.getAccount()?.token
//            val newRequest: Request = chain.request().newBuilder()
//                .addHeader("Authorization", "Bearer $token")
//                .build()
//            return chain.proceed(newRequest)
//        }
//    }).build()
//
//    override val networkService: NetworkService by lazy {
//        Retrofit.Builder()
//            .addConverterFactory(GsonConverterFactory.create())
//            .baseUrl(BASE_URL)
//            .build()
//            .create()
//    }
//
//    override val repository: GenresRepository by lazy {
//        NetworkGenresRepository(networkService)
//    }
//}