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
}
