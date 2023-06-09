package com.example.jetapply.Utils

import androidx.compose.runtime.Composable
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun showBars(flag : Boolean){

    rememberSystemUiController().apply {
        this.isSystemBarsVisible = flag
        this.isNavigationBarVisible = flag
        this.isStatusBarVisible = flag


    }
}