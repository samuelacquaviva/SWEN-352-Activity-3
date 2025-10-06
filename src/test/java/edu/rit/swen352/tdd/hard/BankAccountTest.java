package edu.rit.swen352.tdd.hard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

/**
 * Test suite for the {@link BankAccount} component.
 */
class BankAccountTest {
    BankAccount bankAccount;

    @BeforeEach
    void setup() {
        bankAccount = new BankAccount();
    }

    @Test
    @DisplayName("Test empty constructor")
    void Constructor() {
        String expected = "$0.00";
        assertEquals(bankAccount.getBalance(), expected);
    }

    @Test
    @DisplayName("Test constructor with parameter")
    void Constructor2() {
        BankAccount bankAccount2 = new BankAccount(new Money(1, 1));
        String expected = "$1.01";
        assertEquals(bankAccount2.getBalance(), expected);
    }

    @Test
    @DisplayName("Test empty account")
    void isAccEmpty() {
        assertTrue(bankAccount.isAccountEmpty());
    }

    @Test
    @DisplayName("Test filled account")
    void isAccEmpty2() {
        BankAccount bankAccount2 = new BankAccount(new Money(1, 1));
        assertFalse(bankAccount2.isAccountEmpty());
    }

    @Test
    @DisplayName("Test deposit")
    void deposit() {    
        bankAccount.deposit(new Money(1, 1));
        String expected = "$1.01";
        assertEquals(bankAccount.getBalance(), expected);
    }

    @Test
    @DisplayName("Test deposit")
    void withdraw() {    
        bankAccount.deposit(new Money(1, 1));
        bankAccount.withdraw(new Money(0, 51));
        String expected = "$0.50";
        assertEquals(bankAccount.getBalance(), expected);
    }
}
