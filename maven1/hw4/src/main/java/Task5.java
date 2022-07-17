import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        Task5 task5 = new Task5();
        int n;
        do {
            System.out.println("Введите размер массива: ");
            n = sc.nextInt();
        } while (n <= 3);
        int [] Array = new int[n];
        final int low = 0;
        task5.RundomValueArray(Array, low, n);
        task5.MethodRefactorArr(Array);
    }

    public void MethodRefactorArr(int[] Arr) {
        System.out.println(Arrays.toString(Arr));
        int counter = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] % 2 == 0) {
                counter++;
            }
        }
        int[] Arr2 = new int[counter];
        int j = 0;
        for ( int i = 0; i < Arr2.length; i++) {
            if (Arr[i] % 2 == 0) {
                Arr2[j] = Arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(Arr2));
    }

    void RundomValueArray(int[] Arr, int Low, int High) {
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = (int) Math.round(Math.random() * (High - Low)) + Low;
        }
    }
}
