package ua.nix.boiko.hw1;

import java.util.Scanner;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String input = sc.nextLine();
        Task2 task2 = new Task2();
        task2.MethodOfTree(input);
        sc.close();
    }

    public void MethodOfTree(String input) {
        TreeMap<Character, Integer> resultList = new TreeMap();
        int Count;

        for(int i = 0; i < input.length(); ++i) {
            if (resultList.containsKey(input.charAt(i))) {
                 Count = (Integer)resultList.get(input.charAt(i)) + 1;
                resultList.put(input.charAt(i), Count);
            } else {
                resultList.put(input.charAt(i), 1);
            }
        }

        System.out.println("Результат");
        System.out.println(resultList);
    }
}

