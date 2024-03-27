package com.jenyasubbotina.bookexchanger.android.navigation.request

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.jenyasubbotina.bookexchanger.android.ui.components.BottomBarScreen
import com.jenyasubbotina.bookexchanger.android.ui.detailed_card.RequestScreen

internal fun NavGraphBuilder.requestScreen(navController: NavHostController) {
    composable(BottomBarScreen.RequestScreen.route) {
        RequestScreen(
            onBackClicked = { navController.popBackStack() },
        )
    }
}