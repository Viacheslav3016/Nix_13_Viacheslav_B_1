import java.util.Arrays;

public class Task2 {
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

    public void RundomValueArray(int[] Arr, int Low, int High) {
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = (int) Math.round(Math.random() * (High - Low)) + Low;
        }
    }
}
