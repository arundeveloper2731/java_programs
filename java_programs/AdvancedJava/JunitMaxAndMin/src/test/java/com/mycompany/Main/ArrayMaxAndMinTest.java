package com.mycompany.Main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayMaxAndMinTest {
    
   
    @Test
    public void testFindMax() {
        System.out.println("findMax");
        int[] arr = {12,5,8,20,3};
        ArrayMaxAndMin instance = new ArrayMaxAndMin();
        int expResult = 20;
        int result = instance.findMax(arr);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindMin() {
        System.out.println("findMin");
        int[] arr = {12,5,8,20,3};
        ArrayMaxAndMin instance = new ArrayMaxAndMin();
        int expResult = 3;
        int result = instance.findMin(arr);
        assertEquals(expResult, result);
    }
    
}
