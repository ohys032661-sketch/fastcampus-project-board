package com.fastcampus.projectboard.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@WebMvcTest
@DisplayName("Data REST - API 테스트")
@Transactional
@AutoConfigureMockMvc
@SpringBootTest
public class DataRestTest {
    private final MockMvc mvc;

    public DataRestTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }

    @DisplayName("[api] 게시글 리스트 조회")
    @Test
    void apiArticleListTest() throws Exception {
        // Given

        // When & Then
        mvc.perform(get("/api/articles"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/vnd.hal+json")));
                //.andDo(print());
    }

    @DisplayName("[api] 게시글 단건 조회")
    @Test
    void apiArticleTest() throws Exception {
        // Given

        // When & Then
        mvc.perform(get("/api/articles/2"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/vnd.hal+json")));
        //.andDo(print());
    }

    @DisplayName("[api] 게시글 -> 댓글 리스트 조회")
    @Test
    void apiCommentListFromArticleTest() throws Exception {
        // Given

        // When & Then
        mvc.perform(get("/api/articles/1/comments"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/vnd.hal+json")));
        //.andDo(print());
    }

    @DisplayName("[api] 댓글 리스트 조회")
    @Test
    void apiArticleCommentsTest() throws Exception {
        // Given

        // When & Then
        mvc.perform(get("/api/articleComments"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/vnd.hal+json")));
        //.andDo(print());
    }

    @DisplayName("[api] 댓글 단건 조회")
    @Test
    void apiArticleCommentTest() throws Exception {
        // Given

        // When & Then
        mvc.perform(get("/api/articleComments/2"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/vnd.hal+json")));
        //.andDo(print());
    }
    
}
