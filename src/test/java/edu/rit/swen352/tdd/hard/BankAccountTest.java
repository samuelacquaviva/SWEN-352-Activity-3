package edu.rit.swen352.tdd.hard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

/**
 * Test suite for the {@link BankAccount} component.
 */
class BankAccountTest {
  private BankAccount ba;

  @BeforeEach
  void setup() {
    ba = new BankAccount();
  }

  @Test
  @DisplayName("Constructor should set balance to $0.00 when returned")
  void testConstructor() {
    String expected = "$0.00";
    assertEquals(expected, ba.getBalance());
  }

  @Test
  @DisplayName("Get if account balance is 0")
  void testIsAccountEmpty() {
    boolean expected = true;
    assertEquals(expected, ba.isAccountEmpty());
  }

  @Test
  @DisplayName("Deposit updates balance")
  void testDeposit() {
    Money depositAmount = new Money(5, 20);
    ba.deposit(depositAmount);
    String expected = "$5.20";
    assertEquals(expected, ba.getBalance());
  }

  @Test
  @DisplayName("Withdraw updates balance")
  void testWithdraw() {
    ba.deposit(new Money(5, 20));
    Money withdrawAmount = new Money(2, 30);
    ba.withdraw(withdrawAmount);
    String expected = "$2.90";
    assertEquals(expected, ba.getBalance());
  }
}
