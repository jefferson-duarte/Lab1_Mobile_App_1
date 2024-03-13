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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun BSignUp() {
    Surface (
        color = black
    ) {
        Column (
            horizontalAlignment =  Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
        ) {
            BSignUp_ImgLocker()
            BSignUp_TextWelcome()
            BSignUp_DataLoginPart()
            BSignUp_LoginPart()
            BSignUp_IconPart()
        }
    }
}

@Composable
fun BSignUp_ImgLocker(){
    Image(
        painter = painterResource(id = R.drawable.black_locker),
        contentDescription = "Locker Imagem",
        modifier = Modifier
            .padding(top = 75.dp, bottom = 25.dp)
    )
}

@Composable
fun BSignUp_TextWelcome(){
    Row{
        Text(
            text = "Let's create an account for you",
            color = lightGrey
        )
    }
}


@Composable
fun BSignUp_DataLoginPart(){
    Box(
        modifier = Modifier
            .height(200.dp)
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp)
            .background(black)
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
        ) {
            TextField(
                value = "Email",
                onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = lightBlack,
                    focusedContainerColor = lightBlack,
                    focusedTextColor = white,
                    unfocusedTextColor = white,
                ),
                modifier = Modifier
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(14.dp))

            TextField(
                value = "Password",
                onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = lightBlack,
                    focusedContainerColor = lightBlack,
                    focusedTextColor = white,
                    unfocusedTextColor = white,
                ),
                modifier = Modifier
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(14.dp))

            TextField(
                value = "Confirm Password",
                onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = lightBlack,
                    focusedContainerColor = lightBlack,
                    focusedTextColor = white,
                    unfocusedTextColor = white,
                ),
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
    }
}

@Composable
fun BSignUp_LoginPart() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp)
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .background(lightBlack)
                .height(60.dp),
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = lightBlack,
                contentColor = Color.Black,
            )
        ) {
            Text(
                text = "Sing Up",
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}

@Composable
fun BSignUp_IconPart() {
    Column {
        Row (
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 75.dp)
        ){
            Text(
                text = "Already a member? ",
                color = lightGrey,
            )
            Text(
                text = "Login now",
                fontWeight = FontWeight.Bold,
                color = white,
            )
        }
    }
}