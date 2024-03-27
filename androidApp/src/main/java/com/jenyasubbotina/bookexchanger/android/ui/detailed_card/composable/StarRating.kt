package com.jenyasubbotina.bookexchanger.android.ui.detailed_card.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.jenyasubbotina.bookexchanger.android.R

@Composable
fun ColumnScope.StarRating(
    rating: Float,
    arrangement: Arrangement.Horizontal,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = arrangement,
    ) {
        val minRating = 1
        val maxRating = 5
        val actualRating = rating.coerceIn(minRating.toFloat(), maxRating.toFloat())

        for (i in minRating..maxRating) {
            if (i <= actualRating.toInt()) {
                Icon(Icons.Filled.Star, contentDescription = null, tint = colorResource(id = R.color.orange), modifier = Modifier.size(11.dp))
            } else {
                Icon(Icons.Filled.Star, contentDescription = null, tint = colorResource(id = R.color.white), modifier = Modifier.size(11.dp))
            }
        }
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = actualRating.toString(),
            color = colorResource(id = R.color.gray),
        )
    }
}