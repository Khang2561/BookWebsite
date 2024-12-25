package com.devtiro.bookstore_backend.domain.entity

import jakarta.persistence.*

@Entity
@Table(name = "books")
data class BookEntity (
    @Id
    @Column(name="isnb")
    var isnb: String,

    @Column(name="title")
    var title: String,

    @Column(name="description")
    var description: String,

    @Column(name="image")
    var image: String,

    @ManyToOne(cascade = [CascadeType.DETACH])
    @JoinColumn(name = "author_id")
    var authorEntity: AuthorEntity
)