package com.jenyasubbotina.bookexchanger.android.ui.detailed_card.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.jenyasubbotina.bookexchanger.android.R

@Composable
internal fun SelectableButton(
    title: String,
    isSelected: Boolean,
    onSelected: () -> Unit,
) {

    val textColor = if (isSelected) colorResource(R.color.orange) else colorResource(R.color.white)

    Box(
        modifier = Modifier
            .wrapContentWidth()
            .background(
                shape = RoundedCornerShape(6.dp),
                color = if (isSelected) {
                    colorResource(R.color.white)
                } else {
                    colorResource(R.color.blue_with_alpha_24)
                },
            )
            .heightIn(min = 36.dp)
            .clickable { onSelected() },
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = title,
            color = textColor,
            modifier = Modifier.padding(horizontal = 8.dp),
        )
    }
}