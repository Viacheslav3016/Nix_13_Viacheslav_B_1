package ua.nix.boiko.hw2;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int low = 10;
        int high = 99;
        Task3 task3 = new Task3();
        int[] Arr = new int[4];
        task3.RundomValueArray(Arr, low, high);
        task3.MethodRightArr(Arr);
    }

    public void MethodRightArr(int[] Array) {
        boolean val = true;
        System.out.println(Arrays.toString(Array));
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] <= Array[i + 1]) {
                val = false;
                break;
            }
        }
        if (val) {
            System.out.println("Строгая последовательность");
        } else {
            System.out.println("Не строгая последовательность");
        }
    }

    private void RundomValueArray(int[] Arr, int Low, int High) {
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = (int) Math.round(Math.random() * (High - Low)) + Low;
        }
    }

}
