package com.example.bigcart.ui.screen.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import com.example.bigcart.ui.custom_view.PasswordField
import com.example.bigcart.ui.custom_view.SpaceHeight
import com.example.bigcart.ui.custom_view.TextDec
import com.example.bigcart.ui.custom_view.TextHeading
import com.example.bigcart.ui.custom_view.TextInputField
import com.example.bigcart.ui.custom_view.VectorImage
import com.example.bigcart.ui.theme.darkGreen
import com.example.bigcart.ui.theme.darkGrey
import com.example.bigcart.ui.theme.linkColor
import com.example.bigcart.ui.theme.mediumGrey
import com.example.bigcart.ui.theme.white
import com.example.bigcart.utils.FontType
import com.example.bigcart.utils.getFontType

@Composable
fun LoginScreen() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (ivBack, tvTitle, ivImg, clContainer) = createRefs()
        val checkedState = remember { mutableStateOf(true) }

        ImageView(
            image = R.drawable.img_login,
            contentDescription = "",
            scaleType = ContentScale.Crop,
            modifier = Modifier
                .height(600.dp)
                .fillMaxWidth()
                .constrainAs(ivImg) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                },

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
                shape = RoundedCornerShape(topEnd = 10.dp, topStart = 10.dp)
            )
            .padding(horizontal = 16.dp, vertical = 30.dp)
            .constrainAs(clContainer) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            }) {
            TextHeading(
                text = "Welcome back !", fontFamily = getFontType(FontType.SEMI_BOLD),
                fontSize = 25.sp
            )
            TextDec(text = "Sign in to your account")
            SpaceHeight(height = 26.dp)
            TextInputField(hint = "Email Address", leadingIcon = R.drawable.ic_email)
            SpaceHeight(height = 5.dp)
            PasswordField(leadingIcon = R.drawable.ic_lock, hint = "Password")
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Checkbox(
                        checked = checkedState.value,
                        modifier = Modifier.padding(0.dp),
                        onCheckedChange = { checkedState.value = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = darkGreen,
                            uncheckedColor = darkGrey
                        )
                    )
                    TextDec(text = "Remember me")
                }

                TextDec(
                    text = "Forgot Password ?   ",
                    textColor = linkColor,
                    fontFamily = getFontType(FontType.MEDIUM)
                )
            }

            SpaceHeight(height = 16.dp)
            CustomButton(onClick = {}, buttonTitle = "Login")
            SpaceHeight(height = 20.dp)
            ActionText(onClick = {}, text = "Don’t have an account ?", actionText = "Sign Up")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}