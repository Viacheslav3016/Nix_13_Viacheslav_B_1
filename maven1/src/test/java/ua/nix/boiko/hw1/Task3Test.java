package ua.nix.boiko.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void findEndOfLesson() {
         Task3 task3 = new Task3();
         int actual = 6;
         int [] arr =  task3.EndOfSchoolLesson(actual);
         int [] expected = {14,15};
        assertArrayEquals(expected, arr);
    }
}