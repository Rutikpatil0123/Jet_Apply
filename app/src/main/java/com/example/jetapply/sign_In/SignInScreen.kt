package com.example.jetapply.sign_In

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetapply.R


@Composable
fun SignInScreen(
    state: SignInState,
    onSignInClick : () -> Unit
){
    val context = LocalContext.current
    LaunchedEffect(key1 = state.signInError){
        state.signInError?.let { error ->
            Toast.makeText(context, error, Toast.LENGTH_LONG).show()
        }
    }

    Box(modifier = Modifier.fillMaxSize().background(Color.White)) {
        Column (modifier = Modifier.fillMaxSize().padding(10.dp),
            Arrangement.Center,Alignment.CenterHorizontally){

            Image(
                painter = painterResource(id = R.drawable.google_icon),
                contentDescription = "Google Icon"
            )

            Spacer(modifier = Modifier.height(60.dp))

            Text(
                text = "Sign In",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(80.dp))

            Row {
                Button(onClick = onSignInClick,
                    shape = RoundedCornerShape(50),
                    modifier = Modifier.width(300.dp)) {
                    Image(painter = painterResource(id = R.drawable.google), contentDescription = "Google mini",
                        modifier = Modifier.size(25.dp))

                    Spacer(modifier = Modifier.width(20.dp))

                    Text(text = "SIGN IN WITH GOOGLE")
                }

            }
        }
    }

}