package com.dp.teori;

import java.util.Scanner;

public class Sulit2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int bar = scn.nextInt();
        int kol = scn.nextInt();
        int[][] matrix1 = new int[bar][kol];
        int count=0;

        for (int i=0;i<bar;i++) {
            for (int j = 0; j < kol; j++) {
                matrix1[i][j] = ++count;
                System.out.print(count + " ");
            }
            System.out.println();
        }
        int n = scn.nextInt();


        for (int kk=0;kk<n;kk++) {

            int [][] matrix2 = new int[kol][bar];

            for (int i = 0; i < bar; i++) {
                for (int j = 0; j < kol; j++) {
                    matrix2[kol - 1 - j][i] = matrix1[i][j];
                }
            }
            matrix1 = matrix2;
            bar = matrix1.length;
            kol = matrix1[0].length;
            for (int i = 0; i < bar; i++) {
                for (int j = 0; j < kol; j++)
                    System.out.print(matrix1[i][j] + " ");
                System.out.println();
            }
            System.out.println();
        }

    }
}
