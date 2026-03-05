package com.mycompany.numberutils;

public class NumberUtil 
{
    public int factorial(int n) {

        int fact = 1;

        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
    public boolean isPrime(int n) {

        if(n <= 1) {
            return false;
        }

        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
