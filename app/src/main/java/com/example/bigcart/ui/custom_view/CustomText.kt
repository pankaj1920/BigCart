package com.example.bigcart.ui.custom_view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bigcart.R
import com.example.bigcart.ui.theme.black
import com.example.bigcart.ui.theme.darkGrey
import com.example.bigcart.utils.FontType
import com.example.bigcart.utils.getFontType


@Composable
fun TextExtraBold(
    text: String,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = TextStyle()
) {
    Text(

        modifier = modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        text = text, style = textStyle.copy(
            fontSize = 30.sp,
            fontFamily = FontFamily(Font(R.font.poppins_bold, weight = FontWeight.W700))
        )
    )
}

@Composable
fun TextDec(
    text: String,
    modifier: Modifier = Modifier,
    textColor: Color = darkGrey,
    fontFamily: FontFamily = getFontType(FontType.REGULAR),
    textStyle: TextStyle = TextStyle(),
    textAlign: TextAlign = TextAlign.Start,
) {
    Text(
        text = text,
        modifier = modifier,
        textAlign = textAlign,
        style = textStyle.copy(
            color = textColor,
            fontSize = 15.sp,
            fontFamily = fontFamily
        )
    )
}

@Composable
fun TextHeading(
    text: String,
    textColor: Color = black,
    fontFamily: FontFamily = getFontType(FontType.MEDIUM),
    textAlign: TextAlign = TextAlign.Start,
    fontSize: TextUnit = 18.sp,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = TextStyle()
) {
    Text(
        modifier = modifier,
        textAlign = textAlign,
        text = text, style = textStyle.copy(
            color = textColor,
            fontSize = fontSize,
            fontFamily = fontFamily
        )
    )
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ActionText(
    onClick: () -> Unit,
    text: String,
    actionText: String
) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        FlowRow {
            TextDec(text = text)
            SpaceWidth(width = 5.dp)
            TextDec(
                text = actionText,
                textColor = black,
                fontFamily = getFontType(FontType.MEDIUM),
                modifier = Modifier.clickable { onClick.invoke() })
        }
    }

}


@Preview(showBackground = true)
@Composable
fun CustomText() {
    Column(modifier = Modifier.fillMaxSize()) {
        TextExtraBold("Premium Food\nAt Your Doorstep")
        SpaceHeight(height = 20.dp)
        TextDec(
            text = "Lorem ipsum dolor sit amet, consetetur \n" +
                    "sadipscing elitr, sed diam nonumy",
        )

        SpaceHeight(height = 20.dp)
        TextHeading(text = "Welcome")

        SpaceHeight(height = 20.dp)
        ActionText(onClick = {}, text = "Don’t have an account ?", actionText ="Login" )
    }
}