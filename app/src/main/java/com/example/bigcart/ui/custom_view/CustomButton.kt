package com.example.bigcart.ui.custom_view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bigcart.R
import com.example.bigcart.ui.theme.black
import com.example.bigcart.ui.theme.white


@Composable
fun CustomButton(
    onClick: () -> Unit,
    buttonTitle: String,
) {
    val buttonGreenGradient = Brush.horizontalGradient(listOf(Color(0xFFAEDC81), Color(0xFF6CC51D)))

    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(contentColor = Color.Transparent),
        contentPadding = PaddingValues(0.dp),
        shape = RoundedCornerShape(5.dp),
        modifier = Modifier
            .padding(0.dp)
            .fillMaxWidth()
            .height(60.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .background(brush = buttonGreenGradient)
        ) {
            Text(
                text = buttonTitle,
                color = Color.White,
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold, weight = FontWeight.W600))
            )
        }

    }
}

@Composable
fun ButtonIcon(
    onClick: () -> Unit,
    whiteBg: Boolean = true,
    text:String,
    textColor:Color= black,
    leadingIcon: Int? = null,
    trailingIcon: Int? = null
) {

    val buttonGreenGradient = Brush.horizontalGradient(
        if (whiteBg) listOf(white, white) else listOf(
            Color(0xFFAEDC81),
            Color(0xFF6CC51D)
        )
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(brush = buttonGreenGradient, shape = RoundedCornerShape(5.dp))
            .clickable { onClick.invoke() }
    ) {
        leadingIcon?.let {
            VectorImage(
                image = it,
                modifier = Modifier
                    .align(alignment = Alignment.CenterStart)
                    .padding(start = 30.dp)
            )
        }

        TextHeading(
            text = text,
            textAlign = TextAlign.Center,
            textColor= textColor,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)

        )

        trailingIcon?.let {
            VectorImage(
                image = it,
                modifier = Modifier
                    .align(alignment = Alignment.CenterEnd)
                    .padding(end = 30.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CustomButtonPreview() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 15.dp)
    ) {
        CustomButton(onClick = {}, "Get Started")
        SpaceHeight(height = 20.dp)
        ButtonIcon(
            onClick = {},
            text = "Continue with google",
            leadingIcon = R.drawable.ic_google,
            trailingIcon = R.drawable.ic_google
        )
    }
}