package com.mycompany.numberutils;

public class NumberUtils {

    public static void main(String[] args) 
    {
        NumberUtil num = new NumberUtil();
        
        int numb = 5;
        
        int factorial = num.factorial(numb);
        boolean prime = num.isPrime(numb);
        
        System.out.println("Factorial : "+factorial);
        System.out.println("Prime : "+prime);
        
        int numb2 = 8;
        System.out.println("Prime : "+num.isPrime(numb2));
    }
}
