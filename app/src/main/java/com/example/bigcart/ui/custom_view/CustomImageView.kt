package com.example.bigcart.ui.custom_view

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import com.example.bigcart.ui.theme.white

@Composable
fun ImageView(
    image: Int,
    contentDescription: String = "",
    modifier: Modifier = Modifier,
    scaleType: ContentScale = ContentScale.Fit,
) {
    Image(
        painter = painterResource(id = image),
        contentDescription = contentDescription,
        modifier = modifier,
        contentScale = scaleType
    )
}

@Composable
fun VectorImage(
    image: Int,
    contentDescription: String = "",
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Fit,
    tintColor: Color? = null
) {
    Image(
        imageVector = ImageVector.vectorResource(id = image),
        contentDescription = contentDescription,
        modifier = modifier,
        contentScale = contentScale,
        colorFilter = tintColor?.let { ColorFilter.tint(it) }
    )
}
