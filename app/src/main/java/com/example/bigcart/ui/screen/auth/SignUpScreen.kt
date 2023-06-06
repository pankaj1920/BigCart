package com.example.bigcart.ui.screen.auth

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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.bigcart.R
import com.example.bigcart.ui.custom_view.ActionText
import com.example.bigcart.ui.custom_view.CustomButton
import com.example.bigcart.ui.custom_view.ImageView
import com.example.bigcart.ui.custom_view.SpaceHeight
import com.example.bigcart.ui.custom_view.TextDec
import com.example.bigcart.ui.custom_view.TextHeading
import com.example.bigcart.ui.custom_view.TextInputField
import com.example.bigcart.ui.custom_view.VectorImage
import com.example.bigcart.ui.theme.mediumGrey
import com.example.bigcart.ui.theme.white
import com.example.bigcart.utils.FontType
import com.example.bigcart.utils.getFontType

@Composable
fun SignUpScreen() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (ivBack, tvTitle, ivImg, clContainer) = createRefs()
        ImageView(
            image = R.drawable.img_signup, scaleType = ContentScale.Crop, modifier = Modifier
                .fillMaxWidth()
                .height(600.dp)
        )

        VectorImage(image = R.drawable.ic_back_arrow, modifier = Modifier.constrainAs(ivBack) {
            start.linkTo(parent.start, 15.dp)
            top.linkTo(parent.top, 60.dp)
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
            .fillMaxWidth()
            .background(
                mediumGrey,
                shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp)
            )
            .padding(vertical = 30.dp, horizontal = 16.dp)
            .constrainAs(clContainer) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            }) {
            TextHeading(
                text = "Create account", fontFamily = getFontType(FontType.SEMI_BOLD),
                fontSize = 25.sp
            )
            TextDec(text = "Quickly create account")
            SpaceHeight(height = 26.dp)
            TextInputField(hint = "Email Address", leadingIcon = R.drawable.ic_email)
            SpaceHeight(height = 5.dp)
            TextInputField(hint = "Phone Number", leadingIcon = R.drawable.ic_phone)
            SpaceHeight(height = 5.dp)
            TextInputField(hint = "Password", leadingIcon = R.drawable.ic_lock)
            SpaceHeight(height = 17.dp)
            CustomButton(onClick = {  }, buttonTitle = "Signup")
            SpaceHeight(height = 20.dp)
            ActionText(onClick = { }, text = "Already have an account ?", actionText ="Login" )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignUpScreenPreview() {
    SignUpScreen()
}