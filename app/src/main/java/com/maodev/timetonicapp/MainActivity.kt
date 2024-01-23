package com.maodev.timetonicapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels


import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.maodev.timetonicapp.data.model.Routes
import com.maodev.timetonicapp.data.viewModel.GetAllBooksViewModel
import com.maodev.timetonicapp.ui.landingPage.BooksGridView
import com.maodev.timetonicapp.ui.loginScreen.LoginPage



import com.maodev.timetonicapp.ui.theme.TimetonicAppTheme

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<GetAllBooksViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {

            TimetonicAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFF0EBE6)
                ) {
                    val navigationController = rememberNavController()
                    NavHost(
                        navController = navigationController,
                        startDestination = Routes.LoginScreen.route
                    ) {
                        composable(Routes.LoginScreen.route) {
                            LoginPage(navigationController)
                        }
                        composable(Routes.LandingPage.route) { BooksGridView(viewModel) }
                    }
                }
            }
        }
    }
}