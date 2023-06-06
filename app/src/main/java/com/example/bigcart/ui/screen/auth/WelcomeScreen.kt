package com.example.bigcart.ui.screen.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.bigcart.R
import com.example.bigcart.ui.custom_view.ActionText
import com.example.bigcart.ui.custom_view.ButtonIcon
import com.example.bigcart.ui.custom_view.SpaceHeight
import com.example.bigcart.ui.custom_view.TextDec
import com.example.bigcart.ui.custom_view.TextHeading
import com.example.bigcart.ui.custom_view.VectorImage
import com.example.bigcart.ui.theme.mediumGrey
import com.example.bigcart.ui.theme.white
import com.example.bigcart.utils.FontType
import com.example.bigcart.utils.getFontType

@Composable
fun WelcomeScreen() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (ivBack, tvTitle, ivImg, clContainer) = createRefs()

        Image(
            modifier = Modifier
                .height(600.dp)
                .fillMaxWidth()
                .constrainAs(ivImg) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                },
            painter = painterResource(id = R.drawable.img_welcome),
            contentDescription = "Welcome Screen",
            contentScale = ContentScale.Crop
        )

        VectorImage(image = R.drawable.ic_back_arrow, modifier = Modifier.constrainAs(ivBack) {
            start.linkTo(parent.start, 15.dp)
            top.linkTo(parent.top, 30.dp)
        })

        TextHeading(
            text = "Welcome",
            textColor = white,
            textAlign = TextAlign.Center,
            modifier = Modifier.constrainAs(tvTitle) {
                start.linkTo(parent.start)
                top.linkTo(ivBack.top)
                bottom.linkTo(ivBack.bottom)
                end.linkTo(parent.end)
            })

        Column(modifier = Modifier
            .background(
                mediumGrey,
                shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
            )
            .padding(vertical = 30.dp, horizontal = 16.dp)
            .fillMaxWidth()
            .constrainAs(clContainer) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            }) {
            TextHeading(
                text = "Welcome Back",
                fontFamily = getFontType(FontType.SEMI_BOLD),
                fontSize = 25.sp
            )
            SpaceHeight(height = 5.dp)
            TextDec(text = stringResource(id = R.string.lorem))
            SpaceHeight(height = 27.dp)
            ButtonIcon(
                onClick = { },
                text = "Continue with google",
                leadingIcon = R.drawable.ic_google
            )
            SpaceHeight(height = 13.dp)
            ButtonIcon(
                onClick = { },
                whiteBg = false,
                textColor = white,
                text = "Continue with google",
                leadingIcon = R.drawable.ic_account
            )
            SpaceHeight(height = 20.dp)
            ActionText(onClick = { }, text = "Already have an account ? ", actionText = "Login")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen()
}