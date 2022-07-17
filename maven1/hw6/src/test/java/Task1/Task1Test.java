package Task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void methodRecursion() {
        Task1 task1 = new Task1();
        int i = 2;
        int Pow = 2;

    }

    @Test
    void methodOfStringRecursion() {
        Task1 task1 =new Task1();
        String str = "Cat";
       String actual =  task1.MethodOfStringRecursion(str);
        String expected = "taC";
        assertEquals(actual, expected);
    }
}