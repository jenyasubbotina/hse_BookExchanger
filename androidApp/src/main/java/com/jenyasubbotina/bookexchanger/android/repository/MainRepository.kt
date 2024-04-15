package com.jenyasubbotina.bookexchanger.android.repository

import com.jenyasubbotina.bookexchanger.android.model.Genre
import com.jenyasubbotina.bookexchanger.android.model.MainPagePojo
import com.jenyasubbotina.bookexchanger.android.model.Offer
import com.jenyasubbotina.bookexchanger.android.network.NetworkService

interface MainRepository {
    suspend fun getAllGenres(): List<Genre>
    suspend fun getSelections(): MainPagePojo
    suspend fun getOfferByID(): Offer
}

internal class NetworkMainRepository(
    private val bookService: NetworkService
) : MainRepository {

    override suspend fun getAllGenres(): List<Genre> = bookService.api.getAllGenres()

    override suspend fun getSelections(): MainPagePojo {
        return bookService.api.getMainPage()
    }

    override suspend fun getOfferByID(): Offer {
        return bookService.api.getOfferByID()
    }

}