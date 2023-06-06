package com.example.bigcart.data

import com.example.bigcart.R
import com.example.bigcart.model.dto.OnboardingModel

object LocalData {

    fun getOnboardingList(): ArrayList<OnboardingModel> {
        val onboardingList = ArrayList<OnboardingModel>()
        onboardingList.add(
            OnboardingModel(
                "Premium Food\nAt Your Doorstep",
                "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy",
                R.drawable.img_slider_1
            ),
        )

        onboardingList.add(
            OnboardingModel(
                "Buy Premium Quality Fruits",
                "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy",
                R.drawable.img_slider_2
            ),
        )

        onboardingList.add(
            OnboardingModel(
                "Premium Food\nAt Your Doorstep",
                "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy",
                R.drawable.img_slider_3
            ),
        )

        onboardingList.add(
            OnboardingModel(
                "Premium Food\nAt Your Doorstep",
                "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy",
                R.drawable.img_slider_4
            ),
        )



        return onboardingList
    }
}