package ua.nix.boiko.hw1;

import org.junit.jupiter.api.Test;

import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void main() {
        String Actual = "19";
        Task2 task2 = new Task2();
        task2.MethodOfTree(Actual);
        TreeMap<Character, Integer> resultListTest = new TreeMap<>(){{put((char) 1,1); put((char) 9,1);}};
        assertEquals(resultListTest, Actual);
    }
}