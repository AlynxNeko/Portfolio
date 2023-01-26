package com.dp.teori;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Buat program memasukkan data integer ke dalam 2 buah array 2 d dengan dimensi mx n
lalu jumlahkan hasilnya. Maksimum dimensi array adalah 4x4.
Berikan exception handling jika ada data yang diinputkan tidak sesuai tipenya,
jumlah data melebihi maks dimensi dll
Contoh:
M = 3   2= 2
Matriks 1
1 2 3
4 5 6
7 8 9
 */
public class Nomer5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = 0;
        do {
            try {
                m = scn.nextInt();
                if (m>4) throw new InputMismatchException();
                int[][] arr1 = new int[m][m];
                int[][] arr2 = new int[m][m];

                for (int x = 0; x < 2; x++) {
                    if (x==0)
                        System.out.println("Matrix 1");
                    else
                        System.out.println("Matrix 2");
                        for (int i = 0; i < m; i++) {
                            for (int j = 0; j < m; j++) {
                                if (x==0)
                                    arr1[i][j] = scn.nextInt();
                                else
                                    arr2[i][j] = scn.nextInt();
                            }
                        }
                }
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print(arr1[i][j]+arr2[i][j] + " ");
                    }
                    System.out.println();
                }
            } catch (InputMismatchException e) {
                System.out.println("Terjadi kesalahan -> Input salah");
            }
        } while (m > 4);
    }
}
