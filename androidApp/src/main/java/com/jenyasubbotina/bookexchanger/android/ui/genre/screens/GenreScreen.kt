package com.jenyasubbotina.bookexchanger.android.ui.genre.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.jenyasubbotina.bookexchanger.android.model.Genre
import com.jenyasubbotina.bookexchanger.android.ui.components.AppBar
import com.jenyasubbotina.bookexchanger.android.ui.genre.composable.GenreBlockWithRightArrow
import com.jenyasubbotina.bookexchanger.android.utils.GENRES_LIST

@Composable
internal fun GenreScreen(
    onGenreClicked: () -> Unit,
) {
    Scaffold(
        backgroundColor = MaterialTheme.colors.surface,
        topBar = {}
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            GenreDetailedContent(
                genresList = GENRES_LIST,
                onGenreClicked = onGenreClicked,
            )
        }
    }
}

@Composable
private fun GenreDetailedContent(
    genresList: List<Genre>,
    onGenreClicked: () -> Unit,
) {
    Column(
        modifier = Modifier.background(color = Color(0xFF537EC5)),
    ) {
        AppBar(modifier = Modifier.padding(14.dp), onValueChange = {})
        Spacer(modifier = Modifier.height(40.dp))

        LazyColumn {
            items(genresList) { item ->
                GenreBlockWithRightArrow(
                    title = item.name ?: "",
                    onGenreClicked = onGenreClicked,
                )
            }
        }
    }
}