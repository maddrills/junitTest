package com.example.junittesting;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {

    Greeting greeting;
    static int c = 0;
    static int d = 0;
    @BeforeAll
    public static void beforeAll(){

        System.out.println("beforeAll number of calls  "+ ++c);
    }

    @BeforeEach
    void startUp(){
        greeting = new Greeting();
        System.out.println("startUp number of calls  "+ ++d);
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
        assertEquals("Hello World",greeting.helloWorld(),()->"did not match with anything");
    }
    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Mathew"));
    }

    @AfterEach
    void afterEach(){
        System.out.print("after each called");
    }

    @AfterAll
    public static void afterAllCalled(){
        System.out.print("After all called");
    }
}