package ua.nix.boiko.hw2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {



    @BeforeEach
    void setUp() {

    }

    @Test
    void main() {
    }

    @Test
    void methodRightArr() {
        Task3 task3 = new Task3();
        int [] ArrActual = new int[]{1,2,3,4};
        task3.MethodRightArr(ArrActual);
        int [] ArrExpected = new int[]{1,2,3,4};
        assertArrayEquals(ArrActual, ArrExpected);
    }
}