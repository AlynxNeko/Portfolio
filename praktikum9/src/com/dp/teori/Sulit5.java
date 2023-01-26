package com.dp.teori;

import java.util.Scanner;

public class Sulit5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] array = new int[n][n];
        int count;
        boolean isSecret=true;

        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                array[i][j] = scn.nextInt();//(int)(Math.random()*2);

        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++){
                if (array[i][j] == 1)
                    count++;
            }
            if (count%2!=0)
                isSecret=false;
        }
        for (int j = 0; j < n; j++) {
            count = 0;
            for (int i = 0; i < n; i++){
                if (array[i][j] == 1)
                    count++;
            }
            if (count%2!=0)
                isSecret=false;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }

        System.out.println(isSecret);
    }
}
