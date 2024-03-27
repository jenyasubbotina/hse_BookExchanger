package com.jenyasubbotina.bookexchanger.android.ui.detailed_card.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp

@Composable
internal fun GenreBlock(genre: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(elevation = 16.dp),
    ) {
        Text(
            modifier = Modifier.padding(vertical = 10.dp, horizontal = 16.dp),
            text = "Жанр: $genre",
        )
    }
}