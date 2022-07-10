package ua.nix.boiko.hw2;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        final int Low = -15;
        final int High = 15;
        int [] Array = new int[12];
        task1.RundomValueArray(Array, Low, High);
        task1.FindingNaxMinArray(Array);
    }

    public int FindingNaxMinArray(int [] Array){
        int maxElement = 0;
        int maxIndex = 0;
        System.out.println(Arrays.toString(Array));
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > maxElement){
                maxElement = Array[i];
                 maxIndex = i;
            }
        }System.out.println("Max: " + maxIndex);
        return maxIndex;
    }

    private void RundomValueArray(int[] Arr, int Low, int High) {
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = (int) Math.round(Math.random() * (High - Low)) + Low;
        }
    }
}

