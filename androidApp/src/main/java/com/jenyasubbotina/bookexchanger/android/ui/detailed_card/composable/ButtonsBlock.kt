package com.jenyasubbotina.bookexchanger.android.ui.detailed_card.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.jenyasubbotina.bookexchanger.android.R

@Composable
internal fun ButtonsBlock(
    isFirstChecked: Boolean,
    isSecondChecked: Boolean,
    isThirdChecked: Boolean,
    onFirstChecked: () -> Unit,
    onSecondChecked: () -> Unit,
    onThirdChecked: () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
            .background(colorResource(id = R.color.blue))
            .horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.spacedBy(5.dp),
    ) {
        SelectableButton(
            title = stringResource(id = R.string.btn_about_book),
            isSelected = isFirstChecked,
            onSelected = onFirstChecked,
        )
        SelectableButton(
            title = stringResource(id = R.string.btn_reviews),
            isSelected = isSecondChecked,
            onSelected = onSecondChecked,
        )
        SelectableButton(
            title = stringResource(id = R.string.btn_other_books_by_author),
            isSelected = isThirdChecked,
            onSelected = onThirdChecked,
        )
    }
}