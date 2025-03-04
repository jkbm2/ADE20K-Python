package com.jhristov.books.data

import androidx.annotation.DrawableRes

data class Book(
        val index: Int,
        val title: String,
        val author: String,
        val releaseDate: String,
        val quote: String,
        val synopsis: String,
        @DrawableRes val coverImage: Int
    )

