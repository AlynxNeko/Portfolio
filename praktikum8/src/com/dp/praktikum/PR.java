package com.dp.praktikum;

import java.util.Scanner;

public class PR {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x,y;
        //just to be sure its positive
        do {
            System.out.print("Input line: ");
            x = scn.nextInt();
        }while (x<1);
        do {
            System.out.print("Input column: ");
            y = scn.nextInt();
        }while (y<1);

        //declaration
        int cho;
        int[][] matrix1 = new int[x][y];

        //filling array
        for (int i=0;i<matrix1.length;i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix1[i][j] = (int)(Math.random()*9);
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("What you want to do?\n" +
                "1. Rotate right\n" +
                "2. Rotate left\n" +
                "3. Flip horizontal\n" +
                "4. Flip vertical\n" +
                "5. Exit");

        do {
            System.out.print("Choice: ");
            cho = scn.nextInt();
            x = matrix1.length;
            y = matrix1[0].length;
            switch (cho){
                case 1:{

                    int [][] matrix2 = new int[y][x];
                    for (int i=0;i<matrix1.length;i++) {
                        for (int j = 0; j < matrix1[0].length; j++) {
                            matrix2[j][x-1-i] = matrix1[i][j];
                        }
                    }
                    matrix1 = matrix2;

                    break;
                }case 2:{
                    int [][] matrix2 = new int[y][x];
                    for (int i=0;i<matrix1.length;i++) {
                        for (int j = 0; j < matrix1[0].length; j++) {
                            matrix2[y-1-j][i] = matrix1[i][j];
                        }
                    }
                    matrix1 = matrix2;

                    break;
                }case 3:{
                    int [][] matrix2 = new int[x][y];
                    for (int i=0;i<matrix1.length;i++) {
                        for (int j = 0; j < matrix1[0].length; j++) {
                            matrix2[i][y-1-j] = matrix1[i][j];
                        }
                    }
                    matrix1 = matrix2;

                    break;
                }case 4:{
                    int [][] matrix2 = new int[x][y];
                    for (int i=0;i<matrix1.length;i++) {
                        for (int j = 0; j < matrix1[0].length; j++) {
                            matrix2[x-1-i][j] = matrix1[i][j];
                        }
                    }
                    matrix1 = matrix2;

                    break;
                }
            }

            for (int i=0;i<matrix1.length;i++) {
                for (int j = 0; j < matrix1[0].length; j++)
                    System.out.print(matrix1[i][j] + " ");
                System.out.println();
            }

        }while (cho!=5);

        System.out.print("See you next time");
    }
}
