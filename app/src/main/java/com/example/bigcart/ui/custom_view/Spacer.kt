package com.example.bigcart.ui.custom_view

import android.widget.Space
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun SpaceHeight(height: Dp) {
    Spacer(modifier = Modifier.height(height))
}

@Composable
fun SpaceWidth(width: Dp) {
    Spacer(modifier = Modifier.width(width))
}