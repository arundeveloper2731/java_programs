
package com.mycompany.stringoperation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StringOperationsTest {
    
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        String str = "hello";
        StringOperations instance = new StringOperations();
        int expResult = 5;
        int result = instance.getLength(str);
        assertEquals(expResult, result);
    }

    @Test
    public void testReverseString() {
        System.out.println("reverseString");
        String str = "java";
        StringOperations instance = new StringOperations();
        String expResult = "avaj";
        String result = instance.reverseString(str);
        assertEquals(expResult, result);
    }

    @Test
    public void testToUpper() {
        System.out.println("toUpper");
        String str = "hello";
        StringOperations instance = new StringOperations();
        String expResult = "HELLO";
        String result = instance.toUpper(str);
        assertEquals(expResult, result);
    }
    
}
