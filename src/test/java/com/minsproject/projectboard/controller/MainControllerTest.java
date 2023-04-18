package com.minsproject.projectboard.controller;

import com.minsproject.projectboard.config.SecurityConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@Import(SecurityConfig.class)
@WebMvcTest(MainControllerTest.class)
class MainControllerTest {

    private final MockMvc mvc;

    public  MainControllerTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }

    @Test
    void givenNothing_whenRequestingRootPage_thenRedirectsToArticlesPage() throws Exception {
        //given
        //when
        //then
        mvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection());
    }
}