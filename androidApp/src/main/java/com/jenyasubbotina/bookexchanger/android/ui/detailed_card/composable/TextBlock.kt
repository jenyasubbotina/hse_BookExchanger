package com.jenyasubbotina.bookexchanger.android.ui.detailed_card.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.jenyasubbotina.bookexchanger.android.R

@Composable
internal fun TextBlock(
    description: String,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(colorResource(id = R.color.white))
            .verticalScroll(rememberScrollState()),
    ) {
        Text(
            modifier = Modifier.padding(13.dp),
            text = description,
        )
    }
}