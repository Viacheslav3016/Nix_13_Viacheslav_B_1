package ua.nix.boiko.hw2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
         final int Low = 1;
        final int High = 10;
        int[] Arr = new int[8];
        task2.RundomValueArray(Arr, Low, High);
        task2.arrToStringMethod(Arr);
    }

    public int[] arrToStringMethod(int[] Array) {
        System.out.println("First array: " + Arrays.toString(Array));
        for (int i = 0; i < Array.length; i++) {
            if (i % 2 == 1) {
                Array[i] = 0;
            }
        }
        System.out.println("Second Arr: " + Arrays.toString(Array));
        return Array;
    }

    private void RundomValueArray(int[] Arr, int Low, int High) {
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = (int) Math.round(Math.random() * (High - Low)) + Low;
        }
    }
}
