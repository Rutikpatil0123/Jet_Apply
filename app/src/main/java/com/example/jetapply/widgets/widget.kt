package com.example.jetapply.widgets

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.jetapply.model.Company
import com.example.jetapply.model.getCompany

@Preview
@Composable
fun CompanyRow(company: Company = getCompany()[0],
               onItemClicked: (String) -> Unit = {}){

    var expanded by remember {
        mutableStateOf(false)
    }

    var cardSize by remember {
        mutableStateOf(100)
    }

    Card(modifier = Modifier
        .padding(4.dp)
        .fillMaxWidth()
        .height(cardSize.dp)
        .clickable {
            onItemClicked(company.companyName)
        },
        shape = RoundedCornerShape(corner = CornerSize(10.dp))
        , elevation = 5.dp)
    {
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start) {

            Surface(modifier = Modifier
                .padding(12.dp)
                .size(100.dp)
                , shape = RectangleShape,
                elevation = 4.dp
            ) {

                Image(painter = rememberImagePainter(data = company.companyLogo),
                    contentDescription = "Company logo")

            }

            Column(modifier = Modifier.padding(4.dp)) {

                Text(text = company.companyName,
                style = MaterialTheme.typography.h5)

                Text(text = "CEO : ${company.nameOfCEO}",
                    style = MaterialTheme.typography.caption)

                Text(text = "since : ${company.year}",
                    style = MaterialTheme.typography.caption)

                AnimatedVisibility(visible = expanded) {
                    Column {
                        Text( buildAnnotatedString {
                            withStyle(style = SpanStyle(color = Color.DarkGray,
                                fontSize = 13.sp)
                            ) {
                                append("About: ")
                            }
                            withStyle(style = SpanStyle(color = Color.DarkGray,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Light)
                            ) {
                                append(company.about)
                            }

                        }, modifier = Modifier.padding(6.dp))

                        Divider(modifier = Modifier.padding(3.dp))
                        Text(text = "Founder: ${company.companyFounder}", style = MaterialTheme.typography.caption)
                        Text(text = "Domain: ${company.companyDomain}", style = MaterialTheme.typography.caption)
                        Text(text = "Products: ${company.companyProducts}", style = MaterialTheme.typography.caption)

                    }
                }



                Icon(imageVector = if (expanded) Icons.Filled.KeyboardArrowUp else
                    Icons.Filled.KeyboardArrowDown,
                    contentDescription = "Down Arrow",
                    modifier = Modifier
                        .size(25.dp)
                        .clickable {
                            cardSize = if(expanded){
                                900
                            }else{
                                400
                            }
                            expanded = !expanded
                        },
                    tint = Color.DarkGray)
            }




        }
        }



}