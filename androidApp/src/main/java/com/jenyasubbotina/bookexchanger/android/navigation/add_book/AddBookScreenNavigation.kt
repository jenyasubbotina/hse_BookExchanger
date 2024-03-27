package com.jenyasubbotina.bookexchanger.android.navigation.add_book

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.jenyasubbotina.bookexchanger.android.ui.add_book.AddBookScreen
import com.jenyasubbotina.bookexchanger.android.ui.components.BottomBarScreen

internal fun NavGraphBuilder.addBookScreen(navController: NavHostController) {
    composable(BottomBarScreen.AddBookScreen.route) {
        AddBookScreen(
            onBackClicked = { navController.popBackStack() },
        )
    }
}