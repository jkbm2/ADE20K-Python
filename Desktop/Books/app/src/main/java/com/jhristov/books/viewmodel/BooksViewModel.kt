package com.jhristov.books.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import com.yourID.books.data.BookTestData

class BooksViewModel : ViewModel() {

    private val _books = MutableStateFlow(BookTestData.books)
    val books: StateFlow<List<Book>> = _books

}
