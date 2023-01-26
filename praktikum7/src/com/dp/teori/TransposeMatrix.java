package com.dp.teori;

public class TransposeMatrix {
    public static void main(String[] args) {
        int bar = 4, kol = 5;
        int[][] matrix1 = new int[bar][kol];
        int[][] matrix2 = new int[kol][bar];
        for (int i = 0; i < matrix1.length; i++)
        {
            for (int j = 0; j < matrix1[i].length; j++)
            {
                matrix2[j][i] = matrix1[i][j] = (int)(Math.random()*9)+1;
                System.out.print(matrix1[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < matrix2.length; i++)
        {
            for (int j = 0; j < matrix2[i].length; j++)
            {
                System.out.print(matrix2[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
