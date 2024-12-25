package com.devtiro.bookstore_backend.controllers
import com.devtiro.bookstore_backend.domain.dto.AuthorDto
import com.devtiro.bookstore_backend.domain.entity.AuthorEntity
import com.devtiro.bookstore_backend.services.AuthorService
import com.devtiro.bookstore_backend.testAuthorDtoA
import com.devtiro.bookstore_backend.toAuthorEntity
import com.fasterxml.jackson.databind.ObjectMapper
import com.ninjasquad.springmockk.MockkBean
import io.mockk.every
import io.mockk.verify
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.post


@SpringBootTest
@AutoConfigureMockMvc
class AuthorsControllerTest @Autowired constructor(
    private val mockMvc: MockMvc,
    @MockkBean val authorService: AuthorService
) {

    val objectMapper = ObjectMapper()

    @BeforeEach
    fun beforeEach(){
        every {
            authorService.save(any())
        }answers {
            firstArg()
        }
    }

    //Test create author
    @Test
    fun `test that create Author returns a HTTP 201 status on a successful create`() {
        mockMvc.post("/v1/authors"){
            contentType = MediaType.APPLICATION_JSON
            accept = MediaType.APPLICATION_JSON
            content = objectMapper.writeValueAsString(
                testAuthorDtoA()
            )
        }.andExpect {
            status { isCreated() }
        }
    }

    @Test
    fun `test that create Author saves the Author`(){
        every {
            authorService.save(any())
        }answers {
            firstArg()
        }
        mockMvc.post("/v1/authors"){
            contentType = MediaType.APPLICATION_JSON
            accept = MediaType.APPLICATION_JSON
            content = objectMapper.writeValueAsString(
                testAuthorDtoA()
            )
        }
        val expected = testAuthorDtoA().toAuthorEntity()
        verify{authorService.save((expected))}
    }
}