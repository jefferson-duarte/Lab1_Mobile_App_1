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
import androidx.compose.foundation.layout.requiredSize
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun gSignUp() {
    Surface (
        color = white
    ) {
        Column (
            horizontalAlignment =  Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
        ) {
            gSignUp_ImgLocker()
            gSignUp_TextWelcome()
            gSignUp_DataLoginPart()
            gSignUp_LoginPart()
            gSignUp_IconPart()
        }
    }
}

@Composable
fun gSignUp_ImgLocker(){
    Image(
        painter = painterResource(id = R.drawable.locker_removebg),
        contentDescription = "Locker Imagem",
        modifier = Modifier
            .padding(top = 75.dp, bottom = 25.dp)
            .requiredSize(110.dp)
    )
}

@Composable
fun gSignUp_TextWelcome(){
    Row{
        Text(text = "Let's create an account for you")
    }
}


@Composable
fun gSignUp_DataLoginPart(){
    Box(
        modifier = Modifier
            .height(200.dp)
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp)
            .background(Color.White)
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
        ) {
            TextField(
                value = "Email",
                onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = lightGrey,
                    focusedContainerColor = lightGrey,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(14.dp))

            TextField(
                value = "Password",
                onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = lightGrey,
                    focusedContainerColor = lightGrey,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(14.dp))

            TextField(
                value = "Confirm Password",
                onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = lightGrey,
                    focusedContainerColor = lightGrey,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
    }
}

@Composable
fun gSignUp_LoginPart() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp)
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.LightGray)
                .height(60.dp),
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.LightGray,
                contentColor = Color.Black,
            )
        ) {
            Text(
                text = "Sing Up",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Composable
fun gSignUp_IconPart() {
    Column {
        Row (
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 75.dp)
        ){
            Text(
                text = "Already a member? ",
            )
            Text(
                text = "Login now",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}