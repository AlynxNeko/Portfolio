package com.dp.teori;

import java.util.Scanner;

public class Sulit3 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] array = new int[n][n];
        for (int i=0;i<n;i++)
            array[0][i]= scn.nextInt();

        for (int i=1;i<n;i++) {
            int j = 0;
            for (; j < n - 1; j++)
                array[i][j] = array[i - 1][j + 1];
        }
    }
}
