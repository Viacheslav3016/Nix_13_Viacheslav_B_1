package ua.nix.boiko.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void methodtest() {
        Task1 task1 = new Task1();
        String input = "h0b2";
        int expected = 2;
        int actual = task1.Methodtest(input);
        assertEquals(expected, actual);
    }
    }