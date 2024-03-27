package com.jenyasubbotina.bookexchanger.android.utils

import com.jenyasubbotina.bookexchanger.android.R
import com.jenyasubbotina.bookexchanger.android.model.Book
import com.jenyasubbotina.bookexchanger.android.model.Genre

internal val GENRES_LIST
    get() = listOf(
        Genre(
            id = 1,
            name = "Художественная литература",
        ),
        Genre(
            id = 2,
            name = "Нехудожественная литература",
        ),
        Genre(
            id = 3,
            name = "Научная литература",
        ),
        Genre(
            id = 4,
            name = "Психология",
        ),
        Genre(
            id = 5,
            name = "Детские книги",
        ),
        Genre(
            id = 6,
            name = "Книги для подростков",
        ),
        Genre(
            id = 7,
            name = "Учебная литература",
        ),
        Genre(
            id = 8,
            name = "Спорт, здоровье",
        ),
        Genre(
            id = 9,
            name = "Дом, дача",
        ),
        Genre(
            id = 10,
            name = "Информационные технологии",
        ),
    )

internal val BOOKS_LIST
    get() = listOf(
        Book(
            title = "Вино из одуванчиков",
            author = "Рей Бредбери",
            city = "г. Казань",
            rating = 5.0f,
            imageRes = R.drawable.book_mock,
        ),
        Book(
            title = "Норвежский лес",
            author = "Харуко Мураками",
            city = "г. Москва",
            rating = 4.8f,
            imageRes = R.drawable.book_norv_forest,
        ),
        Book(
            title = "В метре друг от друга",
            author = "Рейчел Липпинкотт, Микки Дотри, Тобиас",
            city = "г. Москва",
            rating = 4.5f,
            imageRes = R.drawable.book_norv_forest,
        ),
        Book(
            title = "Куриный бульон",
            author = "Джек Кенфилд, Марк Виктор Хансен",
            city = "г. Москва",
            rating = 4.5f,
            imageRes = R.drawable.book_chicken_soup,
        ),
        Book(
            title = "Львы Сицилии",
            author = "Стефания Аучи",
            city = "г. Санкт-Петербург",
            rating = 4.4f,
            imageRes = R.drawable.book_mock,
        ),
    )