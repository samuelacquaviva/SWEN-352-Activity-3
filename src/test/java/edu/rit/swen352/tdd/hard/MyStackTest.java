package edu.rit.swen352.tdd.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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

  

  @Test
  void constructStackWithCustomCapacity() {
    MyStack<String> stack = new MyStack<>(10);
    assertEquals(10, stack.getCapacity());
    assertTrue(stack.isEmpty());
  }


  @Test
  void pushIncreasesSize() {
    MyStack<Integer> stack = new MyStack<>(5);
    stack.push(42);
    assertFalse(stack.isEmpty());
    assertEquals(1, stack.size());
  }



  @Test
  void popReturnsLastPushedElement() {
    MyStack<String> stack = new MyStack<>(5);
    stack.push("A");
    stack.push("B");
    assertEquals("B", stack.pop());
    assertEquals("A", stack.pop());
    assertTrue(stack.isEmpty());
  }


}
