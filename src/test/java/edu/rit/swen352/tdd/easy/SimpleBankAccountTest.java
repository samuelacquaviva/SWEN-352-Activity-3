package edu.rit.swen352.tdd.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test suite for the {@link SimpleBankAccount} component.
 */
class SimpleBankAccountTest {
  private SimpleBankAccount sba = new SimpleBankAccount();

  @BeforeEach
  void setup() {
    sba = new SimpleBankAccount();;
  }

  @Test
  @DisplayName("Constructor should set balance to 0 ")
  void testConstructor() {
    float expected = 0;
    assertEquals(expected, sba.getBalance());
  }

  @Test
  @DisplayName("Get if isAccountEmpty returns true when account balance is 0")
  void testIsAccountEmpty() {
    boolean expected = true;
    assertEquals(expected, sba.isAccountEmpty());
  }

  @Test
  @DisplayName("Get if isAccountEmpty returns false when account balance is > 0")
  void testIsAccountEmpty2() {
    boolean expected = false;
    sba.deposit(1.20f);
    assertEquals(expected, sba.isAccountEmpty());
  }

  @Test
  @DisplayName("Deposit updates balance")
  void testDeposit() {
    float expected = 5.20f;
    sba.deposit(5.20f);
    assertEquals(expected, sba.getBalance());
  }

  @Test
  @DisplayName("Withdraw updates balance")
  void testWithdraw() {
    sba.deposit(5.20f);
    sba.withdraw(2.3f);
    float expected = 2.9f;
    assertEquals(expected, sba.getBalance());
  }
}
