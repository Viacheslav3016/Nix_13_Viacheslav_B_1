package ua.nix.boiko.hw2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @BeforeEach
    void setUp() {
        Task2 task2 = new Task2();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Все прошло успешно");
    }

    @Test
    void main() {
    }

    @Test
    void arrToStringMethod() {
        Task2 task2 = new Task2();
        int [] ActualArr = new int[]{1,2,3,4,5,6,7,8};
        task2.arrToStringMethod(ActualArr);
        int [] ExpectedArr = new int[]{1,0,3,0,5,0,7,0};
        assertArrayEquals(ActualArr, ExpectedArr);
    }
}