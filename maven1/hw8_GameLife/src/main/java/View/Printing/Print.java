package View.Printing;

public class Print {
    public void printMapLife1(String[][] MapOfLife){
        for (int i = 0; i < MapOfLife.length; i++) {
            for (int j = 0; j < MapOfLife.length; j++) {
                if (j == MapOfLife.length - 1)
                    System.out.println(MapOfLife[i][j] + " ");
                else System.out.println(MapOfLife[i][j] + " ");
            }
        }
    }
}
