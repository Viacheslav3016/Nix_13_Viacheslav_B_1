package ua.nix.boiko.hw1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String inputStr = sc.nextLine();
        Task1 task1 = new Task1();
        task1.Methodtest(inputStr);
    }

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
