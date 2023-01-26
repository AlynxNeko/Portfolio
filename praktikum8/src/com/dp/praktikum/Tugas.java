package com.dp.praktikum;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        //input dan inisiasi
        int max, min, bar, kol;
        Scanner scn = new Scanner(System.in);
        System.out.print("Input banyaknya deret: ");
        bar = scn.nextInt();
        System.out.print("Input banyaknya angka per kolom: ");
        kol = scn.nextInt();
        int[][] array = new int[bar+1][kol];

        for (int i=0;i<bar;i++)
            for (int j=0;j<kol;j++){
                System.out.printf("Input deret ke-%d angka ke-%d: ",i+1,j+1);
                array[i][j] = scn.nextInt();
            }

        //eksekusi per kolom
        for (int j = 0; j < array[0].length; j++) {
            min = max = array[0][j];
            for (int i = 0; i < array.length-1; i++) {
                int temp = array[i][j];
                if (min > temp)
                    min = temp;
                if (max < temp)
                    max = temp;
            }
            array[array.length-1][j] = max-min;
        }

        //output
        System.out.println("Deret angka: ");
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
            if (i== array.length-2)
                System.out.println("Selisih: ");
        }
    }
}
