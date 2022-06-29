package ua.nix.boiko.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void main() {
        String Actual = "h1b2";
        Task1 task1 = new Task1();
        task1.Methodtest(Actual);
        int Expected = 3;
        assertEquals(Expected, Actual);

    }
}