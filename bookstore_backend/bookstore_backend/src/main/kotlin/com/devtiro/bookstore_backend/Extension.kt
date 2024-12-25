package com.devtiro.bookstore_backend

import com.devtiro.bookstore_backend.domain.dto.AuthorDto
import com.devtiro.bookstore_backend.domain.dto.BookDto
import com.devtiro.bookstore_backend.domain.entity.AuthorEntity
import com.devtiro.bookstore_backend.domain.entity.BookEntity
import java.awt.print.Book

//-------------------------Author-------------------
fun AuthorEntity.toAuthorDto() = AuthorDto(
    id = this.id,
    name = this.name,
    age = this.age,
    description = this.description,
    image = this.image
)

fun AuthorDto.toAuthorEntity() = AuthorEntity(
    id = this.id,
    name = this.name,
    age = this.age,
    description = this.description,
    image = this.image
)

//-------------------------Book-------------------
