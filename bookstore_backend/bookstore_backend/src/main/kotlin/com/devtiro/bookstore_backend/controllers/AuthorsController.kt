package com.devtiro.bookstore_backend.controllers

import com.devtiro.bookstore_backend.domain.dto.AuthorDto
import com.devtiro.bookstore_backend.services.AuthorService
import com.devtiro.bookstore_backend.toAuthorDto
import com.devtiro.bookstore_backend.toAuthorEntity
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthorsController(private val authorService: AuthorService) {

    //-----------------------------GET-----------------------------

    //-----------------------------POST----------------------------
    //Save new author
    @PostMapping(path = ["/v1/authors"])
    fun createAuthor(@RequestBody authorDto: AuthorDto): ResponseEntity<AuthorDto>{
        val createdAuthor = authorService.save(authorDto.toAuthorEntity()).toAuthorDto()
        return ResponseEntity(createdAuthor, HttpStatus.CREATED)
    }

    //-----------------------------PATCH-----------------------------

    //-----------------------------DELETE-----------------------------
}