package com.example.bigcart.ui.custom_view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bigcart.R
import com.example.bigcart.ui.theme.darkGrey
import com.example.bigcart.ui.theme.white


@Composable
fun TextInputField(
    modifier: Modifier = Modifier,
    hint: String,
    leadingIcon: Int,
) {
    val textValue = remember {
        TextFieldValue("")
    }
    TextField(value = textValue.text,
        onValueChange = { textValue.text },

        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(5.dp),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = white,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        placeholder = {
            TextDec(text = hint)

        },
        leadingIcon = {
            VectorImage(image = leadingIcon)
        })

}

@Composable
fun PasswordField(
    modifier: Modifier = Modifier, leadingIcon: Int, hint: String
) {
    val textValue = remember {
        TextFieldValue("")
    }
    TextField(value = textValue.text,
        modifier = modifier.fillMaxWidth(),
        onValueChange = { textValue.text },
        shape = RoundedCornerShape(5.dp),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = white,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        leadingIcon = {
            VectorImage(image = leadingIcon)
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        placeholder = { TextDec(text = hint) })
}

@Preview(showBackground = true)
@Composable
fun CustomEditTextScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(darkGrey)
            .padding(10.dp)
    ) {
        TextInputField(hint = "Email Address", leadingIcon = R.drawable.ic_email)
        SpaceHeight(height = 20.dp)
        PasswordField(leadingIcon = R.drawable.ic_lock, hint = "Password")
    }
}