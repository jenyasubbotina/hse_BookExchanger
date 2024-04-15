package com.jenyasubbotina.bookexchanger.android.ui.favorites

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jenyasubbotina.bookexchanger.android.MyApplicationTheme
import com.jenyasubbotina.bookexchanger.android.R
import com.jenyasubbotina.bookexchanger.android.ui.components.AppBar

@Composable
fun FavoritesScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
    ) {
        Column(
            modifier = Modifier.background(color = Color(0xFF537EC5)),
        ) {
            AppBar(modifier = Modifier.padding(14.dp), onValueChange = {})
            Spacer(modifier = Modifier.height(40.dp))
            Image(
                painterResource(R.drawable.books_background),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Column(Modifier.padding(horizontal = 6.dp, vertical = 20.dp)) {
            Text(
                "РЕКОМЕНДАЦИИ",
                style = TextStyle(color = Color(0xFFF39422)),
            )
            OfferItem()
        }
    }
}

@Composable
fun OfferItem(
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier
            .width(140.dp)
            .heightIn(min = 170.dp),
        backgroundColor = Color.White,
        elevation = 3.dp
    ) {
        Column {
            Image(
                modifier = Modifier
                    .height(120.dp)
                    .align(Alignment.CenterHorizontally),
                painter = painterResource(id = R.drawable.books_background),
                contentScale = ContentScale.Fit,
                contentDescription = null
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(16.dp)
                    .background(Color(0xFF537EC5)),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = null,
                    tint = Color(0xFFF39422)
                )
                Text(text = "4.9", style = TextStyle(color = Color.White))
                Spacer(modifier = Modifier.width(11.dp))
                Icon(
                    imageVector = Icons.Filled.LocationOn,
                    contentDescription = null,
                    tint = Color(0xFFF39422)
                )
                Text(text = "Москва", style = TextStyle(color = Color.White))
            }
            Text(
                text = "Джек Кенфилд, Марк Виктор Хансен и Эми Ньюмарк",
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )
            Text(text = "Куриный бульон", overflow = TextOverflow.Ellipsis, maxLines = 1)
        }
    }
}