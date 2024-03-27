package com.jenyasubbotina.bookexchanger.android.navigation.genre

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.jenyasubbotina.bookexchanger.android.ui.components.BottomBarScreen
import com.jenyasubbotina.bookexchanger.android.ui.genre.screens.SubGenreScreen

internal fun NavGraphBuilder.subGenreScreen(navController: NavHostController) {
    composable(BottomBarScreen.SubGenreScreen.route) {
        SubGenreScreen(
            onBackClicked = { navController.popBackStack() },
        )
    }
}