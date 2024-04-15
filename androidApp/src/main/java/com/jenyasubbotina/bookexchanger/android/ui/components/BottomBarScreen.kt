package com.jenyasubbotina.bookexchanger.android.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector,
) {
    data object Home : BottomBarScreen(
        route = "home",
        title = "Главная",
        icon = Icons.Outlined.Home,
    )

    data object Genres : BottomBarScreen(
        route = "genres",
        title = "Жанры",
        icon = Icons.Outlined.Add,
    )

    data object Profile : BottomBarScreen(
        route = "profile",
        title = "Профиль",
        icon = Icons.Outlined.Person,
    )

    data object Favorites : BottomBarScreen(
        route = "favorites",
        title = "Избранное",
        icon = Icons.Outlined.Favorite,
    )

    // TODO: вынести в подходящее место, ибо не годится для навигации по экранам
    data object DetailedCard : BottomBarScreen(
        route = "detailed_card",
        title = "",
        icon = Icons.Outlined.Favorite,
    )

    data object SubGenreScreen : BottomBarScreen(
        route = "sub_genre_screen",
        title = "",
        icon = Icons.Outlined.Favorite,
    )

    data object RequestScreen : BottomBarScreen(
        route = "sub_genre_screen",
        title = "",
        icon = Icons.Outlined.Favorite,
    )

    data object AddBookScreen : BottomBarScreen(
        route = "add_book_screen",
        title = "",
        icon = Icons.Outlined.Favorite,
    )
}