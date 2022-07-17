import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        System.out.println("hw3");
        System.out.println("Выбери нужое задание: ");
        System.out.println("1 - Task1, 2 - Task2, 3 - Task3, 0 - exit");
        boolean quit = false;
        Scanner sc = new Scanner(System.in);
        while (!quit) {
            String YourChoice = sc.nextLine();
            if (YourChoice.equals("0"))
                break;
            switch (YourChoice) {
                case "1" -> {
                    System.out.println("Введите строку: ");
                    String inputStr = sc.nextLine();
                    task1.Methodtest(inputStr);
                }
                case "2" -> {
                    System.out.println("Введите строку");
                    String input = sc.nextLine();
                    task2.MethodOfFindingTheSame(input);
                }
                case "3" -> {
                    System.out.print("Ввидите номер урока (число от 1 до 10)");
                    int lessonNumber = sc.nextInt();
                    System.out.println(Arrays.toString(task3.EndOfSchoolLesson(lessonNumber)));
                }
                case "4" -> quit = true;
            }
        }
    }
}
