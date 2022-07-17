import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
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
