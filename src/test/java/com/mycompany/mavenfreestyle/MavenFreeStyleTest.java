package com.mycompany.mavenfreestyle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MavenFreeStyleTest {

    public MavenFreeStyleTest() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        try {
            MavenFreeStyle.main(args); 
        } catch (Exception e) {
            fail("El método main lanzó una excepción inesperada: " + e.getMessage()); 
        }
    }

    @Test
    public void testFibonacci() {
        MavenFreeStyle instance = new MavenFreeStyle();
        assertTrue(instance.fibonacci(1) == 1);
    }

    @Test
    public void testFibonacci2() {
        MavenFreeStyle instance = new MavenFreeStyle();
        assertTrue(instance.fibonacci(10) == 55); 
    }
}
