package Application;

import Task1.Task1;
import Task2.Task2Box;
import Task3.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hw4");
        System.out.println("Выбери нужое задание: ");
        System.out.println("1 - Task1, 2 - Task2, 3 - Task3, 4 - Task4, 5 - Task5, 0 - exit");
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
                    int MathPow = 2;
                    String str = "Cat";
                    System.out.println(Task1.MethodRecursion(i, MathPow));
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

                }
                case "5" -> {

                }
                case "6" -> quit = true;
            }
        }
    }
}
