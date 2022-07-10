package ua.nix.boiko.hw2;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        Task4 task4 = new Task4();
       final int low = 0;
       final int high = 5;
        int[] Arr1 = new int[5];
        int [] Arr2 = new int[5];
        task4.RundomValueArray(Arr1, low,high);
        task4.RundomValueArray(Arr2, low,high);
        task4.DoubleArraysMethod(Arr1, Arr2);
    }
    public String DoubleArraysMethod(int [] Array, int [] Array2){
        System.out.println(Arrays.toString(Array));
        System.out.println(Arrays.toString(Array2));
        if (findingMiddleOfArr(Array) > findingMiddleOfArr(Array2)){
            String s1 = "Первый массив больше второго";
            System.out.println(s1);
            return s1;
        } else if (findingMiddleOfArr(Array2) > findingMiddleOfArr(Array)) {
            String s2 = "Второй больше первого";
            System.out.println(s2);
            return s2;
        }else if (findingMiddleOfArr(Array) == findingMiddleOfArr(Array2)){
            String s3 = "равны";
            System.out.println(s3);
            return s3;
        }
        return "";
    }
    public int  findingMiddleOfArr(int [] Array){
        int  res = 0;
        int counter = 0;
        for (int i = 0; i < Array.length; i++) {
             counter += Array[i];
        }
        res = counter / Array.length;
        return res;
    }

    private void RundomValueArray(int[] Arr, int Low, int High) {
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = (int) Math.round(Math.random() * (High - Low)) + Low;
        }
    }
}
