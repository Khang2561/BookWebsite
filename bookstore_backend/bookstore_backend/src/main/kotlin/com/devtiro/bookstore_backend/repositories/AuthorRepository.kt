package com.devtiro.bookstore_backend.repositories

import com.devtiro.bookstore_backend.domain.entity.AuthorEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorRepository : JpaRepository<AuthorEntity, Long?> {
}