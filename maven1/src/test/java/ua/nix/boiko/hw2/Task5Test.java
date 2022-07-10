package ua.nix.boiko.hw2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @BeforeEach
    void setUp() {
        Task5 task5 = new Task5();
    }

    @Test
    void main() {
    }

    @Test
    void methodRefactorArr() {
        Task5 task5 = new Task5();
        int [] ArrActual = new int[]{4, 3, 3, 2, 1, 3};
        task5.MethodRefactorArr(ArrActual);
        int [] Arrexpected = new int[]{4, 0};
        assertArrayEquals(ArrActual, Arrexpected);
    }
}