package com.mycompany.bankacc;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    
   
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        double amount = 500.0;
        BankAccount instance = new BankAccount(1000);
        instance.deposit(amount);
    }

    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        double amount = 400.0;
        BankAccount instance = new BankAccount(1000);
        instance.withdraw(amount);
    }

    @Test
    public void testCheckBalance() {
        System.out.println("checkBalance");
        BankAccount instance = new BankAccount(1000);
        double expResult = 1000.0;
        double result = instance.checkBalance();
        assertEquals(expResult, result, 0);
    }
    
}
