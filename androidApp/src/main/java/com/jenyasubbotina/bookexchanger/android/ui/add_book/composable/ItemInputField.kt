package com.jenyasubbotina.bookexchanger.android.ui.add_book.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jenyasubbotina.bookexchanger.android.R

@Composable
internal fun ItemInputField(
    hint: String,
    shouldShowIcon: Boolean = false,
) {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 31.dp),
        value = remember { mutableStateOf("") }.value,
        onValueChange = { },
        label = {
            Text(
                text = hint,
                color = colorResource(R.color.dark_gray),
                style = TextStyle(
                    fontSize = 12.sp,
                ),
            )
        },
        shape = RoundedCornerShape(16.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = colorResource(R.color.gray),
            unfocusedBorderColor = colorResource(R.color.gray),
        )
    )
}