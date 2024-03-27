package com.jenyasubbotina.bookexchanger.android.ui.detailed_card.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jenyasubbotina.bookexchanger.android.R

@Composable
internal fun BookInfoBlock(
    bookTitle: String,
    author: String,
    user: String,
) {
    var currentImageIndex by remember { mutableStateOf(0) }
    val imageList = listOf(R.drawable.book_mock, R.drawable.books_background)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        SliderImages(
            images = imageList,
            onPrevClick = { if (currentImageIndex > 0) currentImageIndex-- },
            onNextClick = { if (currentImageIndex < imageList.size - 1) currentImageIndex++ },
            currentImageIndex = currentImageIndex,
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = bookTitle,
            color = colorResource(id = R.color.white),
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = author,
            color = colorResource(id = R.color.gray),
        )
        Spacer(modifier = Modifier.height(4.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_default_user),
                contentDescription = null,
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = user,
                color = colorResource(id = R.color.gray),
            )
        }
    }
}