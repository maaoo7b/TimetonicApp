package com.maodev.timetonicapp.ui.landingPage

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.maodev.timetonicapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BooksGridView() {
    Scaffold(topBar = { MyTopAppBar() }) {
        Column(modifier = Modifier.padding(it)) {
            LazyVerticalGrid(columns = GridCells.Fixed(2), content = {
                items(getBooks()) { booksito ->
                    ItemBook(book = booksito)
                }
            })
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
            containerColor = MaterialTheme.colorScheme.surfaceColorAtElevation(12.dp)
        )
    )
}

fun getBooks(): List<Book> {
    return listOf(
        Book("GG", "GG", R.drawable.ic_launcher_background),
        Book("GG1", "GG1", R.drawable.ic_launcher_background),
        Book("GG2", "GG2", R.drawable.ic_launcher_background),
        Book("GG3", "GG3", R.drawable.ic_launcher_background),
        Book("GG4", "GG4", R.drawable.ic_launcher_background),
        Book("GG5", "GG5", R.drawable.ic_launcher_background),
        Book("GG6", "GG6", R.drawable.ic_launcher_background)
    )

}

@Composable
fun ItemBook(book: Book) {
    Card(
        border = BorderStroke(2.dp, Color.Red),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column() {
            Image(
                painter = painterResource(id = book.photo),
                contentDescription = "BookImg",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = book.name,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = book.realName,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                fontSize = 12.sp
            )
        }
    }
}
