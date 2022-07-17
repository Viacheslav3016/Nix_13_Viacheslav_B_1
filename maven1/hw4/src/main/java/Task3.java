import java.util.Arrays;

public class Task3 {
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

    void RundomValueArray(int[] Arr, int Low, int High) {
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = (int) Math.round(Math.random() * (High - Low)) + Low;
        }
    }
}
