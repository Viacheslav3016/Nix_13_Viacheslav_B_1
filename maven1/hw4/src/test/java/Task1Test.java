import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void findingNaxMinArray() {
        Task1 task1 = new Task1();
        int [] ArrActual = new int[]{-2, -5, 3, -10, -12, 0, -9, -14, 8, -10, 13, 0};
        int Actual =  task1.FindingNaxMinArray(ArrActual);
        int expected = 10;
        assertEquals(expected, Actual);
    }
}