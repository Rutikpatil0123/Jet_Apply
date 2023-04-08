package com.example.jetapply.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetapply.model.Company
import com.example.jetapply.model.getCompany
import com.example.jetapply.navagation.CompanyScreens
import com.example.jetapply.widgets.CompanyRow

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController){

    Scaffold (
        topBar = {
            TopAppBar(backgroundColor = Color.LightGray,
                elevation = 5.dp) {

                Spacer(modifier = Modifier.width(10.dp))

                Text(text = "Jet Apply")
            }
        }
    ){
         MainContent(navController = navController )
    }

}

@Composable
fun MainContent(
    navController: NavController,
    companyList: List<Company> = getCompany()
){

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