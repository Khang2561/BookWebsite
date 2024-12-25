package com.devtiro.bookstore_backend.domain.dto

data class AuthorDto(
    var id: Long?,
    var name: String,
    var age: Int,
    var description: String,
    var image: String
)