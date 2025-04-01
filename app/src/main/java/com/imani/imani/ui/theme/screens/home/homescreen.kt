package com.imani.imani.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.imani.imani.R


@Composable
fun Home_Screen(modifier: Modifier = Modifier) {
    Column (modifier=Modifier
        .fillMaxSize()
        .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top){
        Text( "Welcome to imani's app",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            color=Color.Blue,
            fontStyle = FontStyle.Italic
        )
        Spacer(modifier=Modifier.height(30.dp))
        Image(painter = painterResource(id = R.drawable.kilua),
            contentDescription = "minah",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp))
        Text("Join our community",
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif,
            color = Color.DarkGray,
            fontStyle = FontStyle.Italic
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = { TODO() },
            modifier = Modifier.width(300.dp)) {
            Text(text = "login",
              color = Color.White,
                fontSize = 30.sp,
                fontFamily = FontFamily.Serif,
                fontStyle = FontStyle.Italic

            )

        }
        Spacer(modifier=Modifier.height(30.dp))
        Button(onClick = { TODO() },
            modifier=Modifier.width(300.dp)) {
            Text(text = "Register",
                color = Color.White,
                fontSize = 30.sp,
                fontFamily = FontFamily.Serif,
                fontStyle = FontStyle.Italic
            )
        }

    }

}

@Preview
@Composable
private fun Homeprev() {
    Home_Screen()

}

