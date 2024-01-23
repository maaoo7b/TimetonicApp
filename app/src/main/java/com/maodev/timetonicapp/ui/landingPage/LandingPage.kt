package com.maodev.timetonicapp.ui.landingPage

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.maodev.timetonicapp.data.model.books.BookMapper
import com.maodev.timetonicapp.data.viewModel.GetAllBooksViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BooksGridView(viewModel: GetAllBooksViewModel) {
    val state = viewModel.state
    if (state.isLoading) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            CircularProgressIndicator()
        }
    }
    if (state.book.isNotEmpty()) {
        Scaffold(topBar = { MyTopAppBar() }) {
            Column(
                modifier = Modifier
                    .padding(it)
                    .fillMaxWidth()
                    .background(Color(0xFFECE5E5))
            ) {
                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(1.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    items(state.book) { booksito ->
                        ItemBook(book = booksito)
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar() {
    TopAppBar(
        title = {
            Text(
                text = "TimeTonic's Books App",
                fontWeight = FontWeight.Bold
            )
        },
        colors = TopAppBarDefaults.largeTopAppBarColors(
            containerColor = Color(0xFF8BC34A)
        )
    )
}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun ItemBook(book: BookMapper) {
    Card(
        border = BorderStroke(1.dp, Color.LightGray),
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(5.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFECE5E5))
        ) {
            GlideImage(
                model = book.img,
                contentDescription = "Book cover",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
            )
            Text(
                text = book.title,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(8.dp),
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
    }
}
