package edu.rit.swen352.tdd.hard;

import java.util.NoSuchElementException;

/**
 * MyStack is a fixed-size, LIFO (last-in-first-out) stack.
 * 
 * @see <a href="https://en.wikipedia.org/wiki/Stack_(abstract_data_type)">Stack
 *      ADT</a>
 *
 *      <p>
 *      You must implement these features:
 *      <ul>
 *      <li>constructor: with and without the capacity (defaults to 16)</li>
 *      <li>getCapacity: returns the fixed capacity of the stack</li>
 *      <li>isEmpty: queries if the stack is empty</li>
 *      <li>size: queries how many elements in the stack</li>
 *      <li>push: add an element to the stack; throw
 *      {@link IllegalStateException} if the stack is full</li>
 *      <li>pop: remove and return the top element of the stack; throw
 *      {@link java.util.NoSuchElementException} if the stack is empty</li>
 *      </ul>
 *
 * @param <T> the type of elements in the stack.
 */
public class MyStack<T> {
    private static final int DEFAULT_CAPACITY = 16;
    private final int capacity;
    private int size = 0;
    private final Object[] elements;

    public MyStack() {
        this(DEFAULT_CAPACITY);
    }

    public MyStack(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(T element) {
        if (size == capacity) {
            throw new IllegalStateException("Stack is full");
        }
        elements[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        T element = (T) elements[--size];
        elements[size] = null; // clear reference
        return element;
    }
}