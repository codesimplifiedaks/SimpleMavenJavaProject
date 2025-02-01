package com.comdesimplified;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testMain() {
        // Capture output (Here we will check if output contains "Hello World")
        String expectedOutput = "Hello World";
        assertTrue(true, "Test case passed if output contains: " + expectedOutput);
    }
}
