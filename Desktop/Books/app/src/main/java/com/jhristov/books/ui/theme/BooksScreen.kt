package com.jhristov.books.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.jhristov.books.data.Book
import com.jhristov.books.viewmodel.BooksViewModel

@Composable
fun BooksScreen(viewModel: BooksViewModel = viewModel()) {
    val books by viewModel.books.collectAsState()

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(books) { book ->
            BookItem(book)
        }
    }
}

@Composable
fun BookItem(book: Book) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text("${book.index}. ${book.title}", style = MaterialTheme.typography.headlineSmall)
        Text(book.author, fontWeight = androidx.compose.ui.text.font.FontWeight.Bold)
        Text(book.quote, fontStyle = androidx.compose.ui.text.font.FontStyle.Italic)
        Image(painterResource(book.coverImage), contentDescription = book.title, modifier = Modifier.height(200.dp))
        Spacer(modifier = Modifier.height(16.dp))
    }
}
