package com.jenyasubbotina.bookexchanger.android.navigation.profile

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.jenyasubbotina.bookexchanger.android.ui.components.BottomBarScreen
import com.jenyasubbotina.bookexchanger.android.ui.genre.screens.SubGenreScreen
import com.jenyasubbotina.bookexchanger.android.ui.profile.MyBooksScreen

internal fun NavGraphBuilder.myBookProfileScreen(navController: NavHostController) {
    composable(BottomBarScreen.MyBooks.route) {
        MyBooksScreen(
            onBackClicked = { navController.popBackStack() },
        )
    }
}