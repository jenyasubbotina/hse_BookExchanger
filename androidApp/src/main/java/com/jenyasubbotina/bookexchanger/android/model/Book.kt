package com.jenyasubbotina.bookexchanger.android.model

import androidx.annotation.DrawableRes

data class Book(
    val title: String,
    val author: String,
    val city: String,
    val rating: Float,
    @DrawableRes val imageRes: Int,
)