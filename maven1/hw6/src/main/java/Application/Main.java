package Application;

import Task1.Task1;
import Task2.Task2Box;
import Task3.Task3;
import Task4.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hw6");
        System.out.println("Выбери нужое задание: ");
        System.out.println("1 - Task1, 2 - Task2, 3 - Task3, 4 - Task4, 0 - exit");
        boolean quit = false;
        Scanner sc = new Scanner(System.in);
        while (!quit) {
            String YourChoice = sc.nextLine();
            if (YourChoice.equals("0"))
                break;
            switch (YourChoice) {
                case "1" -> {
                    Task1 task1 = new Task1();
                    int i = 5;
                    int MathPow = -1;
                    String str = "Cat";
                    int result = task1.MethodRecursion(i, MathPow);
                    System.out.println(result);
                    System.out.println(task1.MethodOfStringRecursion(str));
                }
                case "2" -> {
                    Task2Box task2Box = new Task2Box();
                    System.out.println(task2Box.setValue("Beans"));
                }
                case "3" -> {
                    Task3 task3 = new Task3("Hello");
                    System.out.println(task3);
                }
                case "4" -> {
                    int a = 9;
                    int b = 3;
                    Task4 task4 = new Task4();
                    System.out.println(task4.MultRecursion(a, b));
                }
                case "6" -> quit = true;
            }
        }
    }
}
