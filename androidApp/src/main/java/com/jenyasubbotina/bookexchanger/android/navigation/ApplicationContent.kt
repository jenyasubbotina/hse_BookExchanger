package com.jenyasubbotina.bookexchanger.android.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.jenyasubbotina.bookexchanger.android.navigation.add_book.addBookScreen
import com.jenyasubbotina.bookexchanger.android.navigation.detailed_card.detailedCardScreen
import com.jenyasubbotina.bookexchanger.android.navigation.genre.subGenreScreen
import com.jenyasubbotina.bookexchanger.android.navigation.request.requestScreen
import com.jenyasubbotina.bookexchanger.android.ui.add_book.AddBookScreen
import com.jenyasubbotina.bookexchanger.android.ui.chat_screen.ChatScreen
import com.jenyasubbotina.bookexchanger.android.ui.components.BottomBarScreen
import com.jenyasubbotina.bookexchanger.android.ui.genre.screens.GenreScreen
import com.jenyasubbotina.bookexchanger.android.ui.profile.ProfileScreen

internal fun NavGraphBuilder.navigationContent(navController: NavHostController) {
    composable(route = BottomBarScreen.Home.route) {
        ProfileScreen(
            onItemClick = { navController.navigate(BottomBarScreen.DetailedCard.route) },
        )
    }
    composable(route = BottomBarScreen.Genres.route) {
        GenreScreen(
            onGenreClicked = {
                navController.navigate(BottomBarScreen.SubGenreScreen.route)
            },
        )
    }
    composable(route = BottomBarScreen.Favorites.route) {
        AddBookScreen(
            onBackClicked = { navController.popBackStack() },
        )
//        ProfileScreen()
    }
    composable(route = BottomBarScreen.Profile.route) {
        ChatScreen(

        )
//        ProfileScreen()
    }
    detailedCardScreen(navController = navController)
    subGenreScreen(navController = navController)
    requestScreen(navController = navController)
    addBookScreen(navController = navController)
}