package com.mycompany.Main;

public class JunitMaxAndMin {

    public static void main(String[] args) 
    {
        int[] arr ={12,5,8,20,3};
        
        ArrayMaxAndMin mm = new ArrayMaxAndMin();
        
        int max = mm.findMax(arr);
        int min = mm.findMin(arr);
        
        System.out.println("Maximum Value : "+max);
        System.out.println("Minimum Value : "+min);
    }
}
