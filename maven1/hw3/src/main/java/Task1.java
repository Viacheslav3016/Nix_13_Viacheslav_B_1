
import java.util.Scanner;

public class Task1 {
    public int Methodtest(String inputStr) {
        int[] Array = new int[10];
        int count = 0;
        int finalResult = 0;

        for(int i = 0; i < inputStr.length(); ++i) {
            if (Character.isDigit(inputStr.charAt(i))) {
                count = Integer.parseInt(inputStr.substring(i, i + 1));
                Array[i] = count;
                finalResult += Array[i];
            }
        }

        System.out.println(finalResult);
        return count;
    }
}
