package edu.rit.swen352.tdd.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test suite for the {@link Counter} component.
 */
class CounterTest {
  @Test
  void testConstructorWithBothBounds() {
    Counter c = new Counter(5, 10);
    assertEquals(5, c.getLower(), "Lower bound should be 5");
    assertEquals(10, c.getUpper(), "Upper bound should be 10");
    assertEquals(5, c.getCount(), "Initial count should start at lower bound");
  }
  
  @Test
  void testConstructorWithLowerOnly() {
    Counter c = new Counter(7);
    assertEquals(7, c.getLower(), "Lower bound should be 7");
    assertEquals(Integer.MAX_VALUE, c.getUpper(), "Upper bound should default to Integer.MAX_VALUE");
    assertEquals(7, c.getCount(), "Initial count should start at lower bound");
  }

  @Test
  void testNoArgsConstructor() {
    Counter c = new Counter();
    assertEquals(0, c.getLower(), "Lower bound should default to 0");
    assertEquals(Integer.MAX_VALUE, c.getUpper(), "Upper bound should default to Integer.MAX_VALUE");
    assertEquals(0, c.getCount(), "Initial count should start at lower bound (0)");
  }
  
  @Test
  void testGetLower() {
    Counter c = new Counter(5, 10); 
    assertEquals(5, c.getLower(), "getLower() should return the correct lower bound");
  }

}
