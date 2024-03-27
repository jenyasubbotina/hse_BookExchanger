package com.jenyasubbotina.bookexchanger.android.ui.detailed_card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.jenyasubbotina.bookexchanger.android.R
import com.jenyasubbotina.bookexchanger.android.ui.detailed_card.composable.BookInfoBlock
import com.jenyasubbotina.bookexchanger.android.ui.detailed_card.composable.ButtonsBlock
import com.jenyasubbotina.bookexchanger.android.ui.detailed_card.composable.GenreBlock
import com.jenyasubbotina.bookexchanger.android.ui.detailed_card.composable.LinkWithAuthorBlock
import com.jenyasubbotina.bookexchanger.android.ui.detailed_card.composable.StarRating
import com.jenyasubbotina.bookexchanger.android.ui.detailed_card.composable.TextBlock
import com.jenyasubbotina.bookexchanger.android.ui.detailed_card.model.ButtonType

@Composable
internal fun DetailedCardScreen(
    onBackClicked: () -> Unit,
    onWriteRequestClicked: () -> Unit,
) {
    Scaffold(
        backgroundColor = MaterialTheme.colors.surface,
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(colorResource(id = R.color.blue)),
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
                            .wrapContentSize()
                            .size(24.dp)
                    )
                }

                Spacer(modifier = Modifier.weight(1f))

                IconButton(
                    onClick = {
                        // TODO: добавление в избранное
                    },
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_favourite),
                        contentDescription = null,
                        modifier = Modifier
                            .wrapContentSize()
                            .size(30.dp)
                    )
                }

                IconButton(
                    onClick = {
                        // TODO: шеринг книги
                    },
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_share),
                        contentDescription = null,
                        modifier = Modifier
                            .wrapContentSize()
                            .size(24.dp)
                    )
                }
            }
        }
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            DetailedContent(
                genre = "Художественная литература",
                description = stringResource(id = R.string.description_detailed_card_mock),
                onWriteRequestClicked = onWriteRequestClicked,
            )
        }
    }
}

@Composable
private fun DetailedContent(
    genre: String,
    description: String,
    onWriteRequestClicked: () -> Unit,
) {
    var selectedButton by remember { mutableStateOf(ButtonType.ABOUT_BOOK) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(colorResource(id = R.color.blue)),
    ) {
        BookInfoBlock(
            bookTitle = "Вино из одуванчиков",
            author = "Рэй Бредбери",
            user = "Савелий",
        )
        Spacer(modifier = Modifier.height(11.dp))
        LinkWithAuthorBlock(
            authorCityTitle = "г. Казань",
            onWriteClicked = onWriteRequestClicked,
        )
        StarRating(
            rating = 4.0f, // TODO: заменить на рейтинг
            arrangement = Arrangement.Center,
        )
        Spacer(modifier = Modifier.height(10.dp))
        ButtonsBlock(
            isFirstChecked = selectedButton == ButtonType.ABOUT_BOOK,
            isSecondChecked = selectedButton == ButtonType.REVIEWS,
            isThirdChecked = selectedButton == ButtonType.OTHER_BOOKS_BY_AUTHOR,
            onFirstChecked = {
                selectedButton = ButtonType.ABOUT_BOOK
            },
            onSecondChecked = {
                selectedButton = ButtonType.REVIEWS
            },
            onThirdChecked = {
                selectedButton = ButtonType.OTHER_BOOKS_BY_AUTHOR
            }
        )
        Spacer(modifier = Modifier.height(10.dp))
        when (selectedButton) {
            ButtonType.ABOUT_BOOK -> {
                GenreBlock(genre = genre)

                TextBlock(description = description)
            }

            ButtonType.REVIEWS -> {
                // TODO: раздел "ОТЗЫВЫ"
            }

            ButtonType.OTHER_BOOKS_BY_AUTHOR -> {
                // TODO: раздел "Другие книги автора"
            }
        }
    }
}