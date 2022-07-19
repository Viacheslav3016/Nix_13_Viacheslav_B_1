package Task4;

public class Task4 {
    public int MultRecursion(int a, int b) {
        if (b == 0 || a == 0) {
            return 0;
        } else if (b == 1) {
            return a;
        } else if (a == 1) {
            return b;
        }return a+MultRecursion(a, b-1);
    }
}
