package com.devtiro.bookstore_backend.services.impl

import com.devtiro.bookstore_backend.domain.entity.AuthorEntity
import com.devtiro.bookstore_backend.repositories.AuthorRepository
import com.devtiro.bookstore_backend.services.AuthorService
import org.springframework.stereotype.Service

@Service
class AuthorServiceImpl(val authorRepository:AuthorRepository): AuthorService {
    //Save new author
    override fun save(authorEntity: AuthorEntity): AuthorEntity {
        return authorRepository.save(authorEntity)
    }
}