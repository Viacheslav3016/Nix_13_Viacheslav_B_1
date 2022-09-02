package StackLogic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListRealiseTest {
  final  List<Integer> listtest = Arrays.asList(5,15,25,95,45,8);
    @Test
    void addFirst() {
       Stack<Integer> stack = new Stack<>();
        stack.push(120);
        stack.push(150);
        String expected = "150 120";
        String actual = stack.print();
        assertEquals(expected, actual);
//        assertEquals(150, (int) stack.pop());
//        assertEquals("120,", stack.print());
    }

    @Test
    void removeFirst() {
        Stack<Integer> stack = new Stack<>();
        assertTrue(stack.isEmptyStack());
        stack.pushSet(listtest);
        assertFalse(stack.isEmptyStack());
        for (int i = listtest.size(); i > 0; --i) {
            assertEquals(listtest.get(i - 1), stack.pop());
        }
    }

    @Test
    void removeByIndex() {
    }

    @Test
    void isEmpty() {
        Stack<Integer> stack = new Stack<>();
        assertTrue(stack.isEmptyStack());
        stack.pushSet(listtest);
        assertFalse(stack.isEmptyStack());
    }

    @Test
    void displayList() {
        Stack<Integer> stack = new Stack<>();
        stack.pushSet(listtest);
        String actual = stack.print();
        String expected = "8 45 95 25 15 5";
        assertEquals(expected, actual);
    }
}