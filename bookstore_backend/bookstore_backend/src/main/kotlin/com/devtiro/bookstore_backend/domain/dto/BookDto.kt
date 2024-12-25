package com.devtiro.bookstore_backend.domain.dto

class BookDto (
    var isnb: String,
    var title: String,
    var description: String,
    var image: String,
    var authorEntity: AuthorDto
)
