package com.example.bigcart.ui.screen.home.product_details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bigcart.R
import com.example.bigcart.ui.custom_view.ImageView
import com.example.bigcart.ui.custom_view.SpaceHeight
import com.example.bigcart.ui.custom_view.SpaceWidth
import com.example.bigcart.ui.custom_view.TextDec
import com.example.bigcart.ui.custom_view.TextHeading
import com.example.bigcart.ui.custom_view.VectorImage
import com.example.bigcart.ui.theme.black
import com.example.bigcart.ui.theme.darkGrey
import com.example.bigcart.ui.theme.greenColor
import com.example.bigcart.ui.theme.lightGreen
import com.example.bigcart.ui.theme.white
import com.example.bigcart.utils.FontType
import com.example.bigcart.utils.getFontType


@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ProductDetails() {
    Column(
        modifier = Modifier
            .fillMaxSize()
//            .background(mediumGrey)
    ) {
        Box(
            modifier = Modifier
                .height(400.dp)
                .background(lightGreen)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            ImageView(image = R.drawable.img_lemon)
            VectorImage(
                image = R.drawable.ic_back_arrow,
                tintColor = black,
                modifier = Modifier
                    .padding(top = 40.dp, start = 16.dp)
                    .align(Alignment.TopStart)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 30.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                TextHeading(
                    text = "$ 2.22",
                    textColor = greenColor,
                    fontFamily = getFontType(FontType.BOLD)
                )
                VectorImage(image = R.drawable.ic_heart_outline, tintColor = black)
            }

            TextHeading(
                text = "Organic Lemons",
                fontSize = 20.sp,
                fontFamily = getFontType(FontType.BOLD)
            )

            TextDec(text = "150lbs", fontFamily = getFontType(FontType.MEDIUM))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "4.5", fontWeight = FontWeight.W600)
                SpaceWidth(width = 5.dp)
                VectorImage(image = R.drawable.ic_rating)
                SpaceWidth(width = 5.dp)
                Text(text = "(89 reviews)", color = darkGrey)
            }
            SpaceHeight(height = 16.dp)

            Text(buildAnnotatedString {
                withStyle(style = SpanStyle(color = darkGrey, fontSize = 16.sp)) {
                    append(stringResource(id = R.string.product_dec))
                }
                withStyle(
                    style = SpanStyle(
                        color = black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.W600
                    )
                ) {
                    append(" more")
                }
            })

            SpaceHeight(height = 8.dp)

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(white, shape = RoundedCornerShape(5.dp))
                    .padding(horizontal = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TextDec(text = "Quantity", fontFamily = getFontType(FontType.MEDIUM))
                Row(
                    modifier = Modifier
                        .width(150.dp)
                        .fillMaxHeight(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    VectorImage(
                        image = R.drawable.ic_sub,
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(20.dp)
                    )

                    TextHeading(text = "3")

                    VectorImage(
                        image = R.drawable.ic_add,
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(20.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductDetailsScreen() {
    ProductDetails()
}