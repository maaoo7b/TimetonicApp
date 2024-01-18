package com.maodev.timetonicapp.ui.landingPage

import androidx.annotation.DrawableRes

data class Book(
    var name: String,
    var realName: String,
    @DrawableRes var photo: Int
)
