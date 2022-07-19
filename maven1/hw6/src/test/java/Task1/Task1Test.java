package Task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void methodRecursion() {
        Task1 task1 = new Task1();
        int i = 5;
        int Pow = 2;
        int Actual = task1.MethodRecursion(i, Pow);
        int expected = 125;
        assertEquals(Actual, expected);

        int i2 = 2;
        int Pow2 = 0;
        int Actual2 = task1.MethodRecursion(i2, Pow2);
        int expected2 = 2;
        assertEquals(Actual2, expected2);

        int i3 = 2;
        int Pow3 = 1;
        int Actual3 = task1.MethodRecursion(i3, Pow3);
        int expected3 = 4;
        assertEquals(Actual3, expected3);
    };


    @Test
    void methodOfStringRecursion() {
        Task1 task1 =new Task1();
        String str = "Cat";
       String actual =  task1.MethodOfStringRecursion(str);
        String expected = "taC";
        assertEquals(actual, expected);
    }
}