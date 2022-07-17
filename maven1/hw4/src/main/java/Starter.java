import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        Task5 task5 = new Task5();
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
                            final int Low1 = -15;
                            final int High1 = 15;
                            int[] ArrayTask1 = new int[12];
                            task1.RundomValueArray(ArrayTask1, Low1, High1);
                            task1.FindingNaxMinArray(ArrayTask1);
                        }
                        case "2" -> {
                            final int Low2 = 1;
                            final int High2 = 10;
                            int[] ArrayTask2 = new int[8];
                            task2.RundomValueArray(ArrayTask2, Low2, High2);
                            task2.arrToStringMethod(ArrayTask2);
                        }
                        case "3" -> {
                            int low3 = 10;
                            int high3 = 99;
                            int[] ArrayTask3 = new int[4];
                            task3.RundomValueArray(ArrayTask3, low3, high3);
                            task3.MethodRightArr(ArrayTask3);
                        }
                        case "4" -> {
                            final int low4 = 0;
                            final int high4 = 5;
                            int[] Arr1 = new int[5];
                            int[] Arr2 = new int[5];
                            task4.RundomValueArray(Arr1, low4, high4);
                            task4.RundomValueArray(Arr2, low4, high4);
                            task4.DoubleArraysMethod(Arr1, Arr2);
                        }
                        case "5" -> {
                            int n;
                            do {
                                System.out.println("Введите размер массива: ");
                                n = sc.nextInt();
                            } while (n <= 3);
                            int[] ArrayTask5 = new int[n];
                            final int low = 0;
                            task5.RundomValueArray(ArrayTask5, low, n);
                            task5.MethodRefactorArr(ArrayTask5);
                        }
                        case "6" -> quit = true;
                    }
            }
        }
    }

