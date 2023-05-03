package com.example.jetapply.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.jetapply.R
import com.example.jetapply.Utils.showBars
import com.example.jetapply.navagation.CompanyScreens
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController){
    
    showBars(flag = false)
    LaunchedEffect(key1 = true){
        delay(2500)
        navController.navigate(route = CompanyScreens.SignInScreen.name){
            popUpTo(0)
        }
    }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Green),
    Alignment.Center){

        Image(painter = painterResource(id = R.drawable.jet_apply), contentDescription = "Icon")

    }

}