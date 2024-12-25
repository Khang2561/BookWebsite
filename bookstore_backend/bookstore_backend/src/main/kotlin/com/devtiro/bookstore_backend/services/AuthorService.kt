package com.devtiro.bookstore_backend.services
import com.devtiro.bookstore_backend.domain.entity.AuthorEntity

interface AuthorService {
    //Save new author
    fun save(authorEntity: AuthorEntity): AuthorEntity
}