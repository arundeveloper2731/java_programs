package com.mycompany.numberutils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilTest {
    
   
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int n = 5;
        NumberUtil instance = new NumberUtil();
        int expResult = 120;
        int result = instance.factorial(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsPrime() {
        System.out.println("isPrime");
        int n = 5;
        NumberUtil instance = new NumberUtil();

        boolean result = instance.isPrime(n);
        assertTrue( result);
    }
    @Test
    void testNotPrime() {
        System.out.println("NotPrime");
        int n=8;
        NumberUtil instance = new NumberUtil();
        boolean result = instance.isPrime(n);
        assertFalse(result);
    }
    
    
    
}
