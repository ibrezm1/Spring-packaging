package com.example.demo2.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Hello2ServiceTest {

    @Test
    public void testGreet() {
        Hello2Service hello2Service = new Hello2Service();
        String result = hello2Service.greet();
        assertEquals("Hello 2!", result);
    }
}
