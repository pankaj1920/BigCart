package com.example.bigcart.ui.screen.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bigcart.data.LocalData
import com.example.bigcart.ui.custom_view.CustomButton
import com.example.bigcart.ui.custom_view.SpaceHeight
import com.example.bigcart.ui.custom_view.TextDec
import com.example.bigcart.ui.custom_view.TextExtraBold
import com.example.bigcart.ui.theme.darkGreen
import com.example.bigcart.ui.theme.indicatorColor
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.delay


@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnboardingScreen() {
    val sliderList = LocalData.getOnboardingList()
    val pagerState = rememberPagerState()
    Column(modifier = Modifier.fillMaxSize()) {
        // First column with 1f height

        LaunchedEffect(Unit) {
            while (true) {
                delay(1000)
                pagerState.animateScrollToPage(page = (pagerState.currentPage + 1) % (pagerState.pageCount))
            }
        }
        Column(
            modifier = Modifier
                .weight(5f)
                .fillMaxWidth()

        ) {
            HorizontalPager(count = sliderList.size, state = pagerState) { position ->
                Column(modifier = Modifier.fillMaxSize()) {
                    Image(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(2f),
                        painter = painterResource(id = sliderList[position].image),
                        contentDescription = sliderList[position].title,
                        contentScale = ContentScale.Crop
                    )

                    Column(modifier = Modifier.weight(1f)) {
                        SpaceHeight(height = 40.dp)
                        TextExtraBold(text = sliderList[position].title)
                        SpaceHeight(height = 15.dp)
                        TextDec(
                            text = sliderList[position].description,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(horizontal = 50.dp)
                        )
                    }

                }

            }
        }

        // Second column with 2f height
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalPagerIndicator(
                pagerState = pagerState,
                activeColor = darkGreen,
                inactiveColor = indicatorColor
            )
            SpaceHeight(height = 32.dp)
            CustomButton(onClick = { }, buttonTitle = "Get Started")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OnboardingScreenPreview() {
    OnboardingScreen()
}