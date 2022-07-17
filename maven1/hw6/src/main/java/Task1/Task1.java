package Task1;

public class Task1 {

    public static int MethodRecursion(int i, int MathPow){
        if (MathPow == 0){
            return i;
        }else return i * MethodRecursion(i,  MathPow-1);
    }

    public  String MethodOfStringRecursion(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return MethodOfStringRecursion(str.substring(1)) + str.charAt(0);
    }
}
