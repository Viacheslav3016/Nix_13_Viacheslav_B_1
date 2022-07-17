import java.util.Arrays;

public class Task1 {
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
        return maxElement;
    }

    public void RundomValueArray(int[] Arr, int Low, int High) {
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = (int) Math.round(Math.random() * (High - Low)) + Low;
        }
    }
}
