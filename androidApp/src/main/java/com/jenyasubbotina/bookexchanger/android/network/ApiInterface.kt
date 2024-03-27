package com.jenyasubbotina.bookexchanger.android.network

import com.jenyasubbotina.bookexchanger.android.model.Genre
import com.jenyasubbotina.bookexchanger.android.model.MainPagePojo
import com.jenyasubbotina.bookexchanger.android.model.Offer
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("/api/v1/offers/selections")
    suspend fun getMainPage(): MainPagePojo

    @GET("/admin/v1/genres")
    suspend fun getAllGenres(): List<Genre>

    @GET("/api/v1/offers")
    suspend fun getOfferByID(
        @Query("offerId") offerId: String? = null,
    ): Offer

}