package ua.nix.boiko.hw1;
import java.util.Arrays;
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Ввидите номер урока (число от 1 до 10)");
        Task3 task3 = new Task3();
        int lessonNumber = sc.nextInt();
        System.out.println(Arrays.toString(task3.EndOfSchoolLesson(lessonNumber)));
        sc.close();
    }

    public int[] EndOfSchoolLesson(int yourNumber) {
        int OneHour = 60, BaseOflessonDuration = 45, BrakePrimeNum = 5, BrakeNotPrimeNum = 15;
        int startOfLesson = 9 * OneHour;
        int timeOfBreak =
                yourNumber / 2 * BrakePrimeNum + (yourNumber - 1) / 2 * BrakeNotPrimeNum;

        int FinalOfresult =
                startOfLesson + BaseOflessonDuration * yourNumber + timeOfBreak;
        return new int[]{FinalOfresult / OneHour, FinalOfresult % OneHour};
    }
}

