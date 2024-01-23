package com.maodev.timetonicapp.data.model

sealed class Routes(val route: String) {

    object LoginScreen : Routes("login")
    object LandingPage : Routes("landingPage")

}