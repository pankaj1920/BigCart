package com.example.bigcart.model.dto

import androidx.annotation.DrawableRes

data class OnboardingModel(
    val title: String,
    val description: String,
    @DrawableRes
    val image: Int
)
