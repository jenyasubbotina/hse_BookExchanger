package com.jenyasubbotina.bookexchanger.android.ui.detailed_card.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.jenyasubbotina.bookexchanger.android.R

@Composable
internal fun LinkWithAuthorBlock(
    authorCityTitle: String,
    onWriteClicked: () -> Unit,
) {
    Row(
        modifier = Modifier
            .background(
                color = colorResource(R.color.blue),
                shape = RoundedCornerShape(10.dp),
            )
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .background(colorResource(R.color.blue_with_alpha_24))
                .heightIn(min = 35.dp),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = authorCityTitle,
                color = colorResource(id = R.color.white),
            )
        }
        Button(
            modifier = Modifier
                .weight(1f)
                .padding(end = 2.dp)
                .fillMaxWidth()
                .heightIn(min = 35.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = colorResource(R.color.orange),
            ),
            onClick = onWriteClicked,
            shape = RoundedCornerShape(8.dp),
        ) {
            Text(
                text = stringResource(id = R.string.btn_write),
                color = colorResource(id = R.color.white),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}