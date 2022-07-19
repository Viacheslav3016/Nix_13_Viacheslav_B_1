package Task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void multRecursion() {
        Task4 task4 = new Task4();
        int a = 3;
        int b = 9;
        int actual = task4.MultRecursion(a, b);
        int expected = 27;
        assertEquals(actual, expected);

        int a1 = 3;
        int b1 = 1;
        int actual1 = task4.MultRecursion(a1, b1);
        int expected1 = 3;
        assertEquals(actual1, expected1);

        int a2 = 1;
        int b2 = 3;
        int actual2 = task4.MultRecursion(a2, b2);
        int expected2 = 3;
        assertEquals(actual2, expected2);

        int a3 = 0;
        int b3 = 3;
        int actual3 = task4.MultRecursion(a3, b3);
        int expected3 = 0;
        assertEquals(actual3, expected3);

        int a4 = 3;
        int b4 = 0;
        int actual4 = task4.MultRecursion(a4, b4);
        int expected4 = 0;
        assertEquals(actual4, expected4);

    }
}
