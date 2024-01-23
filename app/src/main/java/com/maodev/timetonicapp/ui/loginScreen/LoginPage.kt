package com.maodev.timetonicapp.ui.loginScreen


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.maodev.timetonicapp.data.model.Routes

@Composable
fun LoginPage(navigationController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)

    ) {

        Body(Modifier.align(Alignment.Center), LoginViewModel(), navigationController)

    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Body(
    modifier: Modifier,
    loginViewModel: LoginViewModel,
    navigationController: NavHostController
) {

    val email: String by loginViewModel.email.observeAsState("")
    val password: String by loginViewModel.password.observeAsState("")

    Column(modifier = modifier.padding(8.dp)) {
        Text(
            text = "Timetonics' APP",
            modifier = Modifier
                .padding(8.dp)
                .align(Alignment.CenterHorizontally),
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.size(32.dp))
        OutlinedTextField(
            value = email,
            modifier = modifier
                .width(320.dp)
                .padding(8.dp),
            onValueChange = { loginViewModel.onLoginChanged(email = it, password = password) },
            label = { Text("Email", color = Color.Gray) },
            singleLine = true,
            maxLines = 1,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                unfocusedBorderColor = Color.LightGray,
                focusedBorderColor = Color(0xFF4CAF50),
                containerColor = Color(0xFFECE5E5),
                textColor = Color.Black
            )
        )
        OutlinedTextField(
            value = password,
            modifier = modifier
                .width(320.dp)
                .padding(8.dp),
            onValueChange = { loginViewModel.onLoginChanged(email = email, password = it) },
            label = { Text("Password", color = Color.Gray) },
            singleLine = true,
            maxLines = 1,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                unfocusedBorderColor = Color.LightGray,
                focusedBorderColor = Color(0xFF8BC34A),
                containerColor = Color(0xFFECE5E5),
                textColor = Color.Black
            ), visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.size(16.dp))
        Button(
            onClick = {
                loginViewModel.createAuthkey(email, password)
                navigationController.navigate(Routes.LandingPage.route)
            },
            shape = RoundedCornerShape(12.dp),
            modifier = modifier
                .width(320.dp)
                .padding(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF8BC34A),
                contentColor = Color.Black
            )
        ) {
            Text(text = "LOGIN")
        }
    }
}