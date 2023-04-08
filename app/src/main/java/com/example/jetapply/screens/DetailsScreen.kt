package com.example.jetapply.screens

import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.jetapply.WebActivity
import com.example.jetapply.model.Company
import com.example.jetapply.model.getCompany
import com.example.jetapply.widgets.CompanyRow

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun DetailsScreen(navController: NavController, Organisation: String?){

    val context = LocalContext.current

    val newCompanyList = getCompany().filter{it ->
        it.companyName == Organisation
    }

  Scaffold(topBar = {
      TopAppBar(backgroundColor = Color.LightGray,
      elevation = 8.dp) {

          Row(horizontalArrangement = Arrangement.Start){
              Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrow back",
              modifier = Modifier.clickable {

                  navController.popBackStack()
              })

              Spacer(modifier = Modifier.width(20.dp))

              Text(text = "JetJobs")

              Spacer(modifier = Modifier.width(220.dp))

              Icon(imageVector = Icons.Default.PlayArrow, contentDescription = "Career portal",
              modifier = Modifier
                  .clickable {

                  val intent = Intent(context, WebActivity::class.java)

                  val s = newCompanyList[0].careerPageLink

                  intent.putExtra("Url", s);

                  context.startActivity(intent)

              }
              )


          }

      }
  }) {
    Surface(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()) {

        Column(verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {



            CompanyRow(company = newCompanyList.first())

            Spacer(modifier = Modifier.height(50.dp))

            HorizontalScrollImageView(newCompanyList)

        }

    }
  }


}

@Composable
fun HorizontalScrollImageView(newCompanyList : List<Company> ){
    
    LazyRow{

        items(newCompanyList[0].companyImages){ image ->
           Card(modifier = Modifier
               .padding(12.dp)
               .size(240.dp), elevation = 5.dp) {
               
               Image(painter = rememberImagePainter(data = image), contentDescription = "Company Images")
               
           }

        }
    }
}


