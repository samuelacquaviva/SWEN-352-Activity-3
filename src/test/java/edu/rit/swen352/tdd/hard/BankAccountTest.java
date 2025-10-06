package edu.rit.swen352.tdd.hard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

/**
 * Test suite for the {@link BankAccount} component.
 */
class BankAccountTest {
    private BankAccount bankAccount;

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

}
