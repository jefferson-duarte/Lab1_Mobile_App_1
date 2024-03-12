package com.stu71205.lab1_71205

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun bLogin() {
    Surface (
        color = lightBlack
    ) {
        Column (
            horizontalAlignment =  Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
        ) {
            bLogin_ImgLocker()
            bLogin_TextWelcome()
            bLogin_DataLoginPart()
            bLogin_LoginPart()
            bLogin_IconPart()
        }
    }
}

@Composable
fun bLogin_ImgLocker(){
    Image(
        painter = painterResource(id = R.drawable.black_locker),
        contentDescription = "Locker Imagem",
        modifier = Modifier
            .padding(top = 75.dp, bottom = 50.dp)
    )
}

@Composable
fun bLogin_TextWelcome(){
    Row{
        Text(
            text = "Welcome back you've been missed!",
            color = lightGrey
        )
    }
}

@Composable
fun bLogin_DataLoginPart(){
    Box(
        modifier = Modifier
            .height(160.dp)
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp)
            .background(lightBlack)
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
        ) {
            TextField(
                value = "Email",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            TextField(
                value = "Password",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
            )

            Box(
                modifier = Modifier.fillMaxWidth()
                    .padding(5.dp)
            ) {
                Text(
                    text = "Forgot Password?",
                    color = lightGrey,
                    modifier = Modifier.align(Alignment.CenterEnd)
                )
            }
        }
    }
}

@Composable
fun bLogin_LoginPart() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp),
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Black)
                .height(60.dp),
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = black,
                contentColor = lightBlack,
            )
        ) {
            Text(
                text = "Login",
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}

@Composable
fun bLogin_IconPart() {
    Column {
        Row (
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ){
            Text(
                text = "Or continue with",
                color = lightGrey
            )
        }

        Row(
            modifier = Modifier
                .padding(top = 10.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Image(
                painter = painterResource(id = R.drawable.google_icon_black),
                contentDescription = "Google Icon",
                modifier = Modifier
                    .padding(10.dp)
                    .width(50.dp)
                    .height(50.dp)
                    .clip(RoundedCornerShape(8.dp))
            )

            Image(
                painter = painterResource(id = R.drawable.apple_icon_black),
                contentDescription = "Apple Icon",
                modifier = Modifier
                    .padding(10.dp)
                    .width(50.dp)
                    .height(50.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
        }

        Row (
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ){
            Text(
                text = "Not a member? Register now",
                color = lightGrey,
                modifier = Modifier.padding(top = 10.dp, bottom = 75.dp)
            )
        }
    }
}