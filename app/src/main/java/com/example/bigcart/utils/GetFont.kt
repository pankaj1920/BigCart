package com.example.bigcart.utils

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.example.bigcart.R

enum class FontType {
    REGULAR,
    MEDIUM,
    SEMI_BOLD,
    BOLD

}

fun getFontType(fontType: FontType): FontFamily {
    return when (fontType) {
        FontType.REGULAR -> FontFamily(Font(R.font.poppins_regular))
        FontType.MEDIUM -> FontFamily(Font(R.font.poppins_medium))
        FontType.SEMI_BOLD -> FontFamily(Font(R.font.poppins_semi_bold))
        FontType.BOLD -> FontFamily(Font(R.font.poppins_bold))
    }
}