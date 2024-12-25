package com.devtiro.bookstore_backend

import com.devtiro.bookstore_backend.domain.dto.AuthorDto

fun testAuthorDtoA(id: Long? = null) = AuthorDto(
    id = null,
    name = "John Doe",
    age = 30,
    image = "author-image.png",
    description = "some-descriptionq.jpeg"
)
