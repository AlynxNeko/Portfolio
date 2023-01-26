package com.dp.teori;

import java.util.Scanner;

public class Soals2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int bar = scn.nextInt();
        int kol = scn.nextInt();
        int[][] matrix1 = new int[bar][kol];
        int [][] matrix2 = new int[kol][bar];

        for (int i=0;i<bar;i++) {
            for (int j = 0; j < kol; j++) {
                matrix2[j][bar-1-i] = matrix1[i][j] = (int) (Math.random() * 9) + 1;
            }
        }
        ///////
        for (int i=0;i<bar;i++) {
            for (int j = 0; j < kol; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i=0;i<kol;i++) {
            for (int j = 0; j < bar; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
