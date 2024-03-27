package com.jenyasubbotina.bookexchanger.android.ui.detailed_card.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jenyasubbotina.bookexchanger.android.R

@Composable
internal fun SliderImages(
    images: List<Int>,
    onPrevClick: () -> Unit,
    onNextClick: () -> Unit,
    currentImageIndex: Int,
) {
    Box(
        modifier = Modifier
            .size(
                width = 170.dp,
                height = 160.dp,
            )
            .background(
                color = colorResource(id = R.color.gray_with_alpha_22),
                shape = RoundedCornerShape(6.dp),
            ),
        contentAlignment = Alignment.Center,
    ) {
        if (images.isNotEmpty()) {
            IconButton(
                onClick = onPrevClick,
                modifier = Modifier.align(Alignment.CenterStart)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_arrow_back), // TODO заменить на иконку влево
                    contentDescription = null,
                    modifier = Modifier
                        .wrapContentSize()
                        .size(15.dp),
                )
            }
            Image(
                painter = painterResource(id = images[currentImageIndex]),  // поменять на ассинхронщину
                contentDescription = null,
                modifier = Modifier.size(
                    width = 127.dp,
                    height = 147.dp,
                ),
            )
            IconButton(
                onClick = onNextClick,
                modifier = Modifier.align(Alignment.CenterEnd)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_arrow_right),
                    contentDescription = null,
                    modifier = Modifier
                        .wrapContentSize()
                        .size(15.dp),
                )
            }
        }
    }
}