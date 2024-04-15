package com.jenyasubbotina.bookexchanger.android.ui.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.android.gms.tagmanager.Container
import com.jenyasubbotina.bookexchanger.android.MyApplicationTheme
import com.jenyasubbotina.bookexchanger.android.R
import com.jenyasubbotina.bookexchanger.android.ui.components.AppBar

@Composable
fun AuthScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
    ) {
        Column(
            modifier = Modifier.background(color = Color(0xFF537EC5)).height(100.dp).fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("АВТОРИЗАЦИЯ", style = TextStyle(color = Color.White))
        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            modifier = Modifier.padding(vertical = 20. dp, horizontal = 10.dp).fillMaxWidth()
                .background(color = Color(0xffF9F9FA)),
            elevation =  2.dp,
        ) {
            Column(
                Modifier.padding(40.dp, 30.dp).fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(value = "Nickname", onValueChange = {})
                TextField(value = "Nickname", onValueChange = {})
                TextField(value = "Nickname", onValueChange = {})
                Box(modifier = Modifier.height(37.dp))
                OutlinedButton(
                    modifier = Modifier.width(270.dp),
                    onClick = { },
                    shape = RoundedCornerShape(5.dp, 5.dp, 5.dp, 5.dp),
                    colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color(0xff293A80), contentColor = Color.White)
                ){
                    Text( text = "Войти" )
                }
                Box(modifier = Modifier.height(24.dp))
                Text(
                    text = "Забыли пароль?",
                    style = TextStyle(textDecoration = TextDecoration.Underline)
                )
                Box(modifier = Modifier.height(24.dp))
                OutlinedButton(
                    modifier = Modifier.width(270.dp),
                    onClick = { },
                    shape = RoundedCornerShape(5.dp, 5.dp, 5.dp, 5.dp),
                    colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color(0xffF39422), contentColor = Color.White)
                ){
                    Text( text = "Зарегистрироваться" )
                }
            }
        }
    }
}