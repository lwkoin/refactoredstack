package org.example;

import junit.framework.TestCase;

import java.util.EmptyStackException;

public class AppTest extends TestCase {
    public void testPushAndPop() {
        MyStack<Integer> testStack = new MyStack<>();
        testStack.push(5);
        testStack.push(10);
        assertEquals((Integer)10, testStack.pop());
        assertEquals((Integer)5, testStack.pop());
    }

    public void testPopEmptyStack() {
        MyStack<Integer> testStack = new MyStack<>();
        try {
            testStack.pop();
            fail("Expected an EmptyStackException to be thrown");
        } catch (EmptyStackException e) {
        }
    }

    public void testIsEmptyTrue()
    {
        MyStack<Integer> testStack = new MyStack<>();
        assertTrue( testStack.isEmpty() );
    }
    public void testIsEmptyFalse()
    {
        MyStack<Integer> testStack = new MyStack<>();
        testStack.push(5);
        assertFalse( testStack.isEmpty() );
    }

    public void testSize()
    {
        MyStack<Integer> testStack = new MyStack<>();
        testStack.push(5);
        testStack.push(6);
        testStack.push(7);
        testStack.push(8);
        testStack.push(9);
        testStack.push(10);
        assertEquals(6, testStack.size());
    }
}

