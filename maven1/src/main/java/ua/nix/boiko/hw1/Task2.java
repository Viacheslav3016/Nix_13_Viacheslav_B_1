package ua.nix.boiko.hw1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String input = sc.nextLine();
        Task2 task2 = new Task2();
        task2.MethodOfFindingTheSame(input);
        sc.close();
    }

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

