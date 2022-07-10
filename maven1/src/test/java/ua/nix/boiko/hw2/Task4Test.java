package ua.nix.boiko.hw2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @BeforeEach
    void setUp() {
        Task4 task4 = new Task4();
    }

    @Test
    void main() {
    }

    @Test
    void doubleArraysMethod() {
        Task4 task4 = new Task4();
        int [] Arr1 = new int[]{1,2};
        int [] Arr2 = new int[]{1,2,3};
        String actual = task4.DoubleArraysMethod(Arr1, Arr2);
        String expected = "Второй больше первого";
        assertEquals(expected, actual);

        int []Arr3 = new int[]{1,2,3};
        int [] Arr4 = new int[]{1,2};
        String actual2 = task4.DoubleArraysMethod(Arr3, Arr4);
        String expected2 = "Первый массив больше второго";
        assertEquals(expected2, actual2);

        int []Arr5 = new int[]{1,2,3};
        int [] Arr6 = new int[]{1,2,3};
        String actual3 = task4.DoubleArraysMethod(Arr5, Arr6);
        String expected3 = "равны";
        assertEquals(expected3, actual3);

    }


    @Test
    void findingMiddleOfArr() {
        Task4 task4 = new Task4();
        int [] Arr = new int[]{2,2};
        int expected = 2;
        int Actual = task4.findingMiddleOfArr(Arr);
        assertEquals(expected, Actual);
    }
}