package com.example.demo2.controller;

import com.example.demo2.service.Hello2Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(Hello2Controller.class)
public class Hello2ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private Hello2Service hello2Service;

    @Test
    public void testHello2() throws Exception {
        when(hello2Service.greet()).thenReturn("Hello 2!");

        mockMvc.perform(get("/hello2"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello 2!"));
    }
}