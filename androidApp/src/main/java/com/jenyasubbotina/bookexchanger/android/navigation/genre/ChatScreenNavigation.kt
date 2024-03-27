package com.jenyasubbotina.bookexchanger.android.navigation.genre

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.jenyasubbotina.bookexchanger.android.ui.chat_screen.ChatScreen
import com.jenyasubbotina.bookexchanger.android.ui.components.BottomBarScreen
import com.jenyasubbotina.bookexchanger.android.ui.genre.screens.SubGenreScreen

internal fun NavGraphBuilder.chatScreen(navController: NavHostController) {
    composable(BottomBarScreen.ChatScreen.route) {
        ChatScreen(
            onBackClicked = { navController.popBackStack() },
        )
    }
}