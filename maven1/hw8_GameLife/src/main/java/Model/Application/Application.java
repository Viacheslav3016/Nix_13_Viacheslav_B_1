package Model.Application;

import Controrler.Logic.Status;
import View.Printing.Print;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Print print = new Print();
        Status status = new Status();
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        n = sc.nextInt();
        m = sc.nextInt();
        String[][] MapOfLife = new String[n][m];

        for (int i = 0; i < MapOfLife.length; i++) {
                for (int j = 0; j < MapOfLife.length; j++) {
                    int number = new Random().nextInt(2);
                    if (number == 1)
                        MapOfLife[i][j] = "*";
                    else if (number == 0)
                        MapOfLife[i][j] = "o";
                }
            }
            int[] pArr = status.Detection(MapOfLife, new int[100]);
            MapOfLife = status.findingNext(MapOfLife, pArr).clone();
            print.printMapLife1(MapOfLife);
        }
    }

