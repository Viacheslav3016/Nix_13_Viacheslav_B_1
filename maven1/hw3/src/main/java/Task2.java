import java.util.Scanner;

public class Task2 {
    static final int MAX_CHAR = 256;

    public int MethodOfFindingTheSame(String str) {
        int[] counter = new int[MAX_CHAR];
        int len = str.length();
        for (int i = 0; i < len; i++)

            counter[str.charAt(i)]++;

        char[] chars = new char[str.length()];
        for (int i = 0; i < len; i++) {
            chars[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == chars[j])
                    find++;
            }
            if (find == 1)
                System.out.println(str.charAt(i) + " = " + counter[str.charAt(i)]);
        }
        return len;
    }
}
