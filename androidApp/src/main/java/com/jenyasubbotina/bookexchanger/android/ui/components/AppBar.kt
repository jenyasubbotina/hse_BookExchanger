package com.jenyasubbotina.bookexchanger.android.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable
fun AppBar(
    modifier: Modifier = Modifier,
    text: String = "",
    onValueChange: (String) -> Unit
) {
    var textState by remember { mutableStateOf("") }

    TextField(
        modifier = modifier
            .fillMaxWidth()
            .height(33.dp),
        value = textState,
        placeholder = {
            Text(text = "Поиск книг, авторов", style = TextStyle(Color(0xFFB3B3B3)))
        },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.White,
            cursorColor = Color.Black,
            disabledLabelColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        leadingIcon = {
            Icon(
                imageVector = Icons.Outlined.Search,
                contentDescription = null
            )
        },
        onValueChange = {
            textState = it
        },
        shape = RoundedCornerShape(8.dp),
        singleLine = true,
        trailingIcon = {
            if (textState.isNotEmpty()) {
                IconButton(onClick = { textState = "" }) {
                    Icon(
                        imageVector = Icons.Outlined.Close,
                        contentDescription = null
                    )
                }
            }
        }
    )
}