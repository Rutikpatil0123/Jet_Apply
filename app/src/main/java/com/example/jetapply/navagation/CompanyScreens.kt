package com.example.jetapply.navagation

enum class CompanyScreens {
    HomeScreen,
    DetailScreen,
    SplashScreen,
    ProfileScreen,
    SignInScreen;

    companion object{
        fun fromRoute(route:String?) : CompanyScreens
        = when (route?.substringBefore("/")){
            HomeScreen.name -> HomeScreen
            DetailScreen.name -> DetailScreen
            SplashScreen.name -> SplashScreen
            ProfileScreen.name -> ProfileScreen
            SignInScreen.name -> SignInScreen

            null -> HomeScreen
            else -> throw java.lang.IllegalArgumentException("Route $route is not recognised")
        }
    }

}