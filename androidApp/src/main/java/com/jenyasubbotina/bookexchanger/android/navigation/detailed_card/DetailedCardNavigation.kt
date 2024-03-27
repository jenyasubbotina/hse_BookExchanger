package com.jenyasubbotina.bookexchanger.android.navigation.detailed_card

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.jenyasubbotina.bookexchanger.android.ui.components.BottomBarScreen
import com.jenyasubbotina.bookexchanger.android.ui.detailed_card.DetailedCardScreen

internal fun NavGraphBuilder.detailedCardScreen(navController: NavHostController) {
    composable(BottomBarScreen.DetailedCard.route) {
        DetailedCardScreen(
            onBackClicked = { navController.popBackStack() },
            onWriteRequestClicked = {
                navController.navigate(BottomBarScreen.RequestScreen.route)
            },
        )
    }
}