package com.jenyasubbotina.bookexchanger.android.ui.genre.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jenyasubbotina.bookexchanger.android.R
import com.jenyasubbotina.bookexchanger.android.model.Book
import com.jenyasubbotina.bookexchanger.android.ui.components.AppBar
import com.jenyasubbotina.bookexchanger.android.ui.genre.composable.BookItem
import com.jenyasubbotina.bookexchanger.android.utils.BOOKS_LIST

@Composable
internal fun SubGenreScreen(
    onBackClicked: () -> Unit,
) {
    Scaffold(
        backgroundColor = MaterialTheme.colors.surface,
        topBar = {},
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            SubGenreDetailedContent(
                booksList = BOOKS_LIST,
                onBackClicked = onBackClicked,
            )
        }
    }
}

@Composable
private fun SubGenreDetailedContent(
    booksList: List<Book>,
    onBackClicked: () -> Unit,
) {
    Column(
        modifier = Modifier.background(color = Color(0xFF537EC5)),
    ) {
        AppBar(modifier = Modifier.padding(14.dp), onValueChange = {})
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            IconButton(
                onClick = onBackClicked,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_arrow_back),
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                )
            }

            Spacer(modifier = Modifier.width(40.dp))

            Text(
                text = "Художественная литература".uppercase(),
                color = colorResource(R.color.white),
            )
        }

        LazyColumn(
            modifier = Modifier.background(colorResource(R.color.white)),
        ) {
            items(booksList) { item ->
                BookItem(
                    title = item.title,
                    author = item.author,
                    city = item.city,
                    rating = item.rating,
                    imageRes = item.imageRes,
                )
            }
        }
    }
}