package com.jenyasubbotina.bookexchanger.android.ui.add_book

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
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jenyasubbotina.bookexchanger.android.R
import com.jenyasubbotina.bookexchanger.android.ui.add_book.composable.ItemInputField

@Composable
internal fun AddBookScreen(
    onBackClicked: () -> Unit,
) {
    Scaffold(
        backgroundColor = MaterialTheme.colors.surface,
        topBar = {},
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            AddBookDetailedContent(
                onCompleteClicked = {},
                onBackClicked = {},
            )
        }
    }
}

@Composable
private fun AddBookDetailedContent(
    onCompleteClicked: () -> Unit,
    onBackClicked: () -> Unit,
) {
    Column(
        modifier = Modifier.background(colorResource(R.color.white))
    ) {
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
                    text = "Добавить книгу".uppercase(),
                    color = colorResource(R.color.white),
                )

                Box(modifier = Modifier.size(24.dp))
            }

            Spacer(modifier = Modifier.height(40.dp))
        }
        Column(
            modifier = Modifier.padding(horizontal = 12.dp)
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            ItemInputField("Жанр")
            Spacer(modifier = Modifier.height(10.dp))
            ItemInputField("Автор")
            Spacer(modifier = Modifier.height(10.dp))
            ItemInputField(
                hint = "Жанр",
                shouldShowIcon = true,
            )
            Spacer(modifier = Modifier.height(15.dp))
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 120.dp),
                value = remember { mutableStateOf("") }.value,
                onValueChange = { },
                label = {
                    Text(
                        text = "Описание",
                        color = colorResource(R.color.dark_gray),
                        style = TextStyle(
                            fontSize = 12.sp,
                        ),
                    )
                },
                shape = RoundedCornerShape(16.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = colorResource(R.color.gray),
                    unfocusedBorderColor = colorResource(R.color.gray),
                )
            )
            Spacer(modifier = Modifier.height(54.dp))
            Text("Добавить фото")
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_download),
                    contentDescription = null,
                    modifier = Modifier
                        .wrapContentSize()
                        .size(26.dp),
                )

                Spacer(modifier = Modifier.width(10.dp))

                Text("Обложка.jpg")
            }
            Spacer(modifier = Modifier.height(80.dp))
            Box(
                modifier = Modifier.fillMaxWidth(),
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
                        text = "Готово",
                        color = colorResource(id = R.color.white),
                        textAlign = TextAlign.Center,
                    )
                }
            }
        }
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(R.drawable.background),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
    }
}