package com.devtiro.bookstore_backend.repositories

import com.devtiro.bookstore_backend.domain.entity.BookEntity
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository : JpaRepository<BookEntity, String> {

}