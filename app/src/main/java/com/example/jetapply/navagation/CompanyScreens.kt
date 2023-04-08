package com.example.jetapply.navagation

enum class CompanyScreens {
    HomeScreen,
    DetailScreen,
    ApplyScreen;

    companion object{
        fun fromRoute(route:String?) : CompanyScreens
        = when (route?.substringBefore("/")){
            HomeScreen.name -> HomeScreen
            DetailScreen.name -> DetailScreen
            ApplyScreen.name -> ApplyScreen

            null -> HomeScreen
            else -> throw java.lang.IllegalArgumentException("Route $route is not recognised")
        }
    }

}