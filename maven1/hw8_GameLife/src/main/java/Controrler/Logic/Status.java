package Controrler.Logic;

import java.util.Objects;

public class Status {
    public int[] Detection(String[][] MapOfLife, int[] pArr) {
        int num = 0;
        for (int i = 0; i < MapOfLife.length; i++) {
            for (int j = 0; j < MapOfLife.length; j++) {
                int lifeCount = 0;
                if (i + 1 < 4 && MapOfLife[i + 1][j].equals("*")) {
                    lifeCount++;
                }
                if (i + 1 < 4 && j + 1 < 4 && MapOfLife[i + 1][j + 1].equals("*")) {
                    lifeCount++;
                }
                lifeCount = getLifeCount(MapOfLife, i, j, lifeCount);
                if (i - 1 >= 0 && MapOfLife[i - 1][j].equals("*")) {
                    lifeCount++;
                }
                if (MapOfLife[i][j].equals("*")) {
                    if (lifeCount < 2)
                        System.out.println(pArr[num] = 1);
                    System.out.println("dead");
                     if (lifeCount == 2 || lifeCount == 3)
                        System.out.println(pArr[num] = 2);
                    System.out.println("live");
                    if (lifeCount > 3)
                        System.out.println(pArr[num] = 1);
                    System.out.println("dead");
                } else {
                    if (lifeCount == 3)
                        System.out.println(pArr[num] = 3);
                    System.out.println("regeneration");
                }
                num++;
            }
        }
        return pArr;
    }

    private int getLifeCount(String[][] MapOfLife, int i, int j, int lifeCount) {
        if (i + 1 < 4 && j - 1 >= 0 && MapOfLife[i + 1][j - 1].equals("*")) {
            lifeCount++;
        }
        if (j + 1 < 4 && MapOfLife[i][j + 1].equals("*")) {
            lifeCount++;
        }
        if (j - 1 >= 0 && MapOfLife[i][j - 1].equals("*")) {
            lifeCount++;
        }
        return lifeCount;
    }


    public String[][] findingNext(String[][] MapOfLife, int[] pArr) {
        int number = 0;
        for (int i = 0; i < MapOfLife.length; i++) {
            for (int j = 0; j < MapOfLife.length; j++) {
                if (pArr[number] == 1)
                    MapOfLife[i][j] = "*";
                if (pArr[number] == 3) {
                    MapOfLife[i][j] = "o";
                    number++;
                }
            }
        }
        return MapOfLife;
    }
}

