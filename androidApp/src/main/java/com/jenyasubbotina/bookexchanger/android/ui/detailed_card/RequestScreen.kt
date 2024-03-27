package com.jenyasubbotina.bookexchanger.android.ui.detailed_card

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.jenyasubbotina.bookexchanger.android.R
import com.jenyasubbotina.bookexchanger.android.ui.detailed_card.composable.ItemField
import com.jenyasubbotina.bookexchanger.android.ui.genre.composable.BookItem

@Composable
internal fun RequestScreen(
    onBackClicked: () -> Unit,
) {
    Scaffold(
        backgroundColor = MaterialTheme.colors.surface,
        topBar = {},
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            DetailedContent(
                title = "Вино из одуванчиков",
                author = "Рей Бредбери",
                userName = "Савелий",
                userCity = "г. Казань",
                imageRes = R.drawable.book_mock,
                onBackClicked = onBackClicked,
            )
        }
    }
}

@Composable
private fun DetailedContent(
    title: String,
    author: String,
    userName: String,
    userCity: String,
    @DrawableRes imageRes: Int,
    onBackClicked: () -> Unit,
) {
    Column {
        Column(
            modifier = Modifier.background(colorResource(id = R.color.blue)),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
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
                            .size(24.dp),
                    )
                }

                Text(
                    text = "Запрос".uppercase(),
                    color = colorResource(R.color.white),
                )

                Box(modifier = Modifier.size(24.dp))
            }

            Spacer(modifier = Modifier.height(40.dp))
        }

        BookItem(
            title = title,
            author = author,
            imageRes = imageRes,
        )

        Row(
            modifier = Modifier.padding(
                start = 14.dp,
                end = 7.dp,
            ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Image(
                painter = painterResource(R.drawable.ic_blue_background_default_user),
                contentDescription = null,
                modifier = Modifier.size(25.dp),
            )

            Spacer(modifier = Modifier.width(11.dp))

            ItemField(title = userName)
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.padding(
                start = 14.dp,
                end = 7.dp,
            ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
        ) {
            Image(
                painter = painterResource(R.drawable.ic_location),
                contentDescription = null,
                modifier = Modifier.size(25.dp),
            )

            Spacer(modifier = Modifier.width(11.dp))

            ItemField(title = userCity)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Оставьте сообщение:",
            color = colorResource(R.color.dark_gray),
            modifier = Modifier.padding(start = 10.dp)
        )

        Spacer(modifier = Modifier.height(4.dp))

        CommentField()

        Spacer(modifier = Modifier.height(10.dp))

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.TopCenter,
        ) {
            Button(
                onClick = {},
                modifier = Modifier
                    .wrapContentSize()
                    .heightIn(min = 35.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(R.color.orange),
                ),
                shape = RoundedCornerShape(12.dp),
            ) {
                Text(
                    text = "Отправить запрос",
                    color = colorResource(id = R.color.white),
                    textAlign = TextAlign.Center,
                )
            }

            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(R.drawable.books_transparent_background),
                contentDescription = null,
            )
        }
    }
}

@Composable
private fun CommentField() {
    val textState = rememberSaveable { mutableStateOf("") }

    OutlinedTextField(
        value = textState.value,
        onValueChange = { textState.value = it },
        modifier = Modifier
            .fillMaxWidth()
            .height(198.dp)
            .padding(horizontal = 5.dp),
        textStyle = TextStyle(color = Color.Black),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Gray,
            unfocusedBorderColor = Color.Gray,
        ),
        maxLines = Int.MAX_VALUE,
        singleLine = false
    )
}