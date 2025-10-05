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
}
