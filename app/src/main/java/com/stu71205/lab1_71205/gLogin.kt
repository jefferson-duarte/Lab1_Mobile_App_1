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
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun gLogin() {
    Surface (
        color = lightGrey
    ) {
        Column (
            horizontalAlignment =  Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
        ) {
            gLogin_ImgLocker()
            gLogin_TextWelcome()
            gLogin_DataLoginPart()
            gLogin_LoginPart()
            gLogin_IconPart()
        }
    }
}

@Composable
fun gLogin_ImgLocker(){
    Image(
        painter = painterResource(id = R.drawable.locker),
        contentDescription = "Locker Imagem",
        modifier = Modifier
            .padding(top = 75.dp, bottom = 50.dp)
    )
}

@Composable
fun gLogin_TextWelcome(){
    Row{
        Text(text = "Welcome back you've been missed!")
    }
}

@Composable
fun gLogin_DataLoginPart(){
    Box(
        modifier = Modifier
            .height(160.dp)
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp)
            .background(lightGrey)
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
        ) {
            TextField(
                value = "Email",
                onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = white,
                    focusedContainerColor = white,
                ),
                modifier = Modifier
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            TextField(
                value = "Password",
                onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = white,
                    focusedContainerColor = white,
                ),
                modifier = Modifier
                    .fillMaxWidth()
            )

            Box(
                modifier = Modifier.fillMaxWidth()
                    .padding(5.dp)
            ) {
                Text(
                    text = "Forgot Password?",
                    modifier = Modifier.align(Alignment.CenterEnd)
                )
            }
        }
    }
}

@Composable
fun gLogin_LoginPart() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp),
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White)
                .height(60.dp),
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black,
            )
        ) {
            Text(
                text = "Login",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Composable
fun gLogin_IconPart() {
    Column {
        Row (
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ){
            Text(text = "Or continue with")
        }

        Row(
            modifier = Modifier
                .padding(top = 10.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Image(
                painter = painterResource(id = R.drawable.google_icon),
                contentDescription = "Google Icon",
                modifier = Modifier
                    .padding(10.dp)
                    .width(50.dp)
                    .height(50.dp)
                    .clip(RoundedCornerShape(8.dp))
            )

            Image(
                painter = painterResource(id = R.drawable.apple_icon),
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
                modifier = Modifier.padding(top = 10.dp, bottom = 75.dp)
            )
        }
    }
}