package ua.nix.boiko.hw1;
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ввидите номер урока (число от 1 до 10)");
        int lessonNumber = sc.nextInt();
        String startLesson = "9:00";
        String[] ArrayOfStart = startLesson.split(" ");
        String MainRest = "45";
        String[] ArrayOfRest = MainRest.split("");


        for (int i = 0; i < 11; i++) {
            if (lessonNumber %2 == 0){

            }
        }

    }
}
