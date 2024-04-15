package com.jenyasubbotina.bookexchanger.android.ui.components

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.jenyasubbotina.bookexchanger.android.navigation.navigationContent

@Composable
fun BottomNavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None },
        popEnterTransition = { EnterTransition.None },
        popExitTransition = { ExitTransition.None },
        builder = { navigationContent(navController) },
    )
}