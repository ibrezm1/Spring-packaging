package com.example.demo1.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloServiceTest {

    @Test
    public void testGreet() {
        HelloService helloService = new HelloService();
        assertEquals("Hello, World!", helloService.greet());
    }
}
