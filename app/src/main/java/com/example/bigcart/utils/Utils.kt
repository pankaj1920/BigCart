package com.example.soccashapecompose.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.platform.SoftwareKeyboardController
import androidx.navigation.compose.rememberNavController
import androidx.compose.runtime.*

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlin.time.Duration.Companion.seconds

@Composable
fun getNavController() = rememberNavController()

fun String.removeSpace():String = replace(" ","")

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun getKeyboard(): SoftwareKeyboardController?  = LocalSoftwareKeyboardController.current

@Composable
fun toastMessage(message:String){
    val context = LocalContext.current
//    context.showToast(message)

}

fun downTimer(totalTime: Int, delayTimeInSecond: Int = 1): Flow<Int> = flow {
    var time = totalTime
    while (time >= -1) {
        delay(delayTimeInSecond.seconds)
        emit(time--)

    }
}.flowOn(Dispatchers.IO)

