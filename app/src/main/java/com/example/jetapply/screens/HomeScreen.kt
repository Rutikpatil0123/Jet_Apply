package com.example.jetapply.screens

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Build
import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetapply.WebActivity
import com.example.jetapply.model.Company
import com.example.jetapply.model.getCompany
import com.example.jetapply.navagation.CompanyScreens
import com.example.jetapply.sign_In.SignInScreen
import com.example.jetapply.widgets.CompanyRow

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController){

    val context = LocalContext.current
    val activity = (LocalContext.current as? Activity)


    Scaffold(topBar = {
        TopAppBar(backgroundColor = Color.LightGray,
            elevation = 8.dp) {

            Row(horizontalArrangement = Arrangement.Start){

                Spacer(modifier = Modifier.width(20.dp))

                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back navigation",
                modifier = Modifier.clickable {
                    activity?.finish()
                })


                Spacer(modifier = Modifier.width(20.dp))

                Text(text = "JetJobs")

                Spacer(modifier = Modifier.width(200.dp))

                Icon(imageVector = Icons.Default.Face, contentDescription = "Career portal",
                    modifier = Modifier
                        .clickable {

                            navController.navigate(CompanyScreens.ProfileScreen.name)

                        }
                )


            }

        }
    }){
         MainContent(navController = navController )

    }

}


@Composable
fun MainContent(
    navController: NavController,
    companyList: List<Company> = getCompany()
){
    val activity = (LocalContext.current as? Activity)
    BackHandler() {
        activity?.finish()
    }

    Column(modifier = Modifier.padding(5.dp)) {

        LazyColumn(){
            items(items = companyList){

                CompanyRow(company = it){ it ->
                    navController.navigate(route = CompanyScreens.DetailScreen.name+"/$it")

                }
            }
        }

    }


}

