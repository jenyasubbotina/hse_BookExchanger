package com.jenyasubbotina.bookexchanger.android.ui.genre.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jenyasubbotina.bookexchanger.android.R

@Composable
internal fun GenreBlockWithRightArrow(
    title: String,
    onGenreClicked: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(colorResource(R.color.white))
            .clickable { onGenreClicked() },
    ) {
        Row(
            modifier = Modifier.padding(
                horizontal = 12.dp,
                vertical = 12.dp,
            ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Text(
                modifier = Modifier.weight(1f),
                text = title,
            )
            Image(
                painter = painterResource(id = R.drawable.ic_arrow_right_gray),
                contentDescription = null,
                modifier = Modifier.size(15.dp),
            )
        }

        Divider(
            color = colorResource(R.color.dark_gray),
            thickness = (0.5).dp,
            modifier = Modifier.fillMaxWidth(),
        )
    }
}