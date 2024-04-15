package com.jenyasubbotina.bookexchanger.android

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
//    val colors = if (darkTheme) {
//        darkColorScheme(
//            primary = Color(0xFFBB86FC),
//            secondary = Color(0xFF03DAC5),
//            tertiary = Color(0xFF3700B3)
//        )
//    } else {
//        lightColorScheme(
//            primary = Color(0xFF6200EE),
//            secondary = Color(0xFF03DAC5),
//            tertiary = Color(0xFF3700B3)
//        )
//    }
    val typography = Typography(
        body2 = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        )
    )
    val shapes = Shapes(
        small = RoundedCornerShape(4.dp),
        medium = RoundedCornerShape(4.dp),
        large = RoundedCornerShape(0.dp)
    )

    MaterialTheme(
        //colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}