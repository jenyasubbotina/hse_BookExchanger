package com.jenyasubbotina.bookexchanger.android.ui.genre.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jenyasubbotina.bookexchanger.android.R
import com.jenyasubbotina.bookexchanger.android.ui.detailed_card.composable.StarRating

@Composable
internal fun BookItem(
    title: String,
    author: String,
    rating: Float? = null,
    city: String? = null,
    imageRes: Int? = null,
) {

    Card(
        modifier = Modifier.background(colorResource(R.color.white)),
        elevation = 6.dp,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(colorResource(R.color.white)),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
            ) {
                imageRes?.let {
                    Image(
                        modifier = Modifier.size(
                            width = 78.dp,
                            height = 97.dp,
                        ),
                        painter = painterResource(id = it),
                        contentDescription = null,
                    )
                }
                Spacer(modifier = Modifier.width(6.dp))
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp),
                ) {
                    Text(text = title)
                    Spacer(modifier = Modifier.height(3.dp))
                    Text(
                        text = author,
                        color = colorResource(R.color.dark_gray),
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    city?.let {
                        Text(
                            text = it,
                            color = colorResource(R.color.dark_gray),
                        )
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    rating?.let {
                        StarRating(
                            rating = it,
                            arrangement = Arrangement.Start,
                        )
                    }
                }
            }
        }
    }
    Spacer(modifier = Modifier.height(10.dp))
}