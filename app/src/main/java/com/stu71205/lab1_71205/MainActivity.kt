package com.stu71205.lab1_71205

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            gLogin() // Light Gray
//            gSignUp() // White
//            bLogin() // Light Black
            BSignUp() // Black
        }
    }
}

val lightGrey = Color(0xFFDDDDDD)
val white = Color(0xFFFFFFFF)
val black = Color(0xFF000000)
val lightBlack = Color(0xFF222222)
