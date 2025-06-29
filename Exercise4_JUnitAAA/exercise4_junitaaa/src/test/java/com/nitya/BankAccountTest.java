package com.nitya;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount(); // Arrange
    }

    @After
    public void tearDown() {
        account = null; // Cleanup
    }

    @Test
    public void testDeposit() {
        // Act
        account.deposit(100);
        // Assert
        assertEquals(100, account.getBalance(), 0);
    }

    @Test
    public void testWithdraw() {
        account.deposit(100);
        account.withdraw(40);
        assertEquals(60, account.getBalance(), 0);
    }
}
