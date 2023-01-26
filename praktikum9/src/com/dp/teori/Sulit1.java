package com.dp.teori;

import java.util.Scanner;

public class Sulit1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int[][] array = new int[x][y];

        for (int i=0;i<x;i++)
            for (int j=0;j<y;j++)
                array[i][j]=0;

        soutArray(array);

        while (true) {
            int x1,y1;
            do {
                System.out.println("x ");
                x1 = scn.nextInt();
            } while (x1 > x);
            do {
                System.out.println("y ");
                y1 = scn.nextInt();
            } while (y1 > y);

            int n;
            do {
                System.out.println("input");
                n = scn.nextInt();
            } while (n<1 || n>4);
            if (n==4)
                break;

            array[x1][y1] = n;
            soutArray(array);
        }
    }

    private static void soutArray(int[][] array) {
        for (int i=0;i< array.length;i++) {
            for (int j = 0; j < array[0].length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
}
