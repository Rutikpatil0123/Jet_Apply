package com.example.jetapply

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetapply.navagation.JobNavigation
import com.example.jetapply.ui.theme.JetApplyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetApplyTheme {
                // A surface container using the 'background' color from the theme
                JobNavigation()
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MyApp(content: @Composable () -> Unit){

    JetApplyTheme {

       content()

    }
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetApplyTheme {
         MyApp {
             JobNavigation()
         }
    }
}