package com.example.jetapply.navagation

import android.content.Context
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jetapply.screens.DetailsScreen
import com.example.jetapply.screens.HomeScreen
import com.example.jetapply.screens.ProfileScreen
import com.example.jetapply.screens.SplashScreen
import com.example.jetapply.sign_In.GoogleAuthUiClient
import com.example.jetapply.sign_In.SignInScreen
import com.example.jetapply.sign_In.SignInViewModel
import com.google.android.gms.auth.api.identity.Identity
import kotlinx.coroutines.launch

/*
        @Composable
        fun JobNavigation() {

            private val googleAuthUiClient by lazy {
                GoogleAuthUiClient(
                    context = getApplication,
                    oneTapClient = Identity.getSignInClient(applicationContext)
                )
            }


            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = CompanyScreens.SplashScreen.name
            ) {

                composable(CompanyScreens.HomeScreen.name) {
                    HomeScreen(navController)
                }

                composable(
                    CompanyScreens.DetailScreen.name + "/{company}",

                    arguments = listOf(navArgument(name = "company") { type = NavType.StringType })
                ) { backStackEntry ->

                    DetailsScreen(
                        navController = navController,
                        backStackEntry.arguments?.getString("company")
                    )
                }


                composable(CompanyScreens.SplashScreen.name) {
                    SplashScreen(navController)
                }

                composable(CompanyScreens.SignInScreen.name) {
                    val viewModel = viewModel<SignInViewModel>()
                    val state by viewModel.state.collectAsStateWithLifecycle()

                    LaunchedEffect(key1 = Unit) {
                        if (googleAuthUiClient.getSignedInUser() != null) {
                            navController.navigate("profile")
                        }
                    }

                    val launcher = rememberLauncherForActivityResult(
                        contract = ActivityResultContracts.StartIntentSenderForResult(),
                        onResult = { result ->
                            if (result.resultCode == ComponentActivity.RESULT_OK) {
                                lifecycleScope.launch {
                                    val signInResult = googleAuthUiClient.signInWithIntent(
                                        intent = result.data ?: return@launch
                                    )
                                    viewModel.onSignInResult(signInResult)
                                }
                            }
                        }
                    )

                    LaunchedEffect(key1 = state.isSignInSuccessful) {
                        if (state.isSignInSuccessful) {
                            Toast.makeText(
                                applicationContext,
                                "Sign in successful",
                                Toast.LENGTH_LONG
                            )
                                .show()
                            navController.navigate("profile")
                            viewModel.resetState()
                        }
                    }

                    SignInScreen(
                        state = state,
                        onSignInClick = {
                            lifecycleScope.launch {
                                val signInIntentSender = googleAuthUiClient.signIn()
                                launcher.launch(
                                    IntentSenderRequest.Builder(
                                        signInIntentSender ?: return@launch
                                    ).build()
                                )
                            }
                        })
                }

                composable(CompanyScreens.ProfileScreen.name) {
                    ProfileScreen(
                        userData = googleAuthUiClient.getSignedInUser(),
                        onSignOut = {
                            lifecycleScope.launch {
                                googleAuthUiClient.signOut()
                                Toast.makeText(applicationContext, "Sign out", Toast.LENGTH_LONG)
                                    .show()
                                navController.popBackStack()
                            }
                        }
                    )
                }


            }
        }
*/