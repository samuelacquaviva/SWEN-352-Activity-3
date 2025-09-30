package edu.rit.swen352.tdd.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Test suite for the {@link MyStack} component.
 */
class MyStackTest {
  @Test
  void constructStackWithDefaultCapacity() {
    MyStack<Integer> stack = new MyStack<>();
    assertEquals(16, stack.getCapacity());
    assertTrue(stack.isEmpty());
    assertEquals(0, stack.size());
  }

}
