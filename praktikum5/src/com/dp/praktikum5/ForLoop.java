package com.dp.praktikum5;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("P x L = ");
        int jumlahBaris = scn.nextInt();
        int jumlahKolom = scn.nextInt();
        int angka = 1;

        for (int i=1;i<=jumlahBaris;i++){
            for (int j=1;j<=jumlahKolom;j++){
                System.out.print(angka + " ");
                angka++;
            }
            System.out.println();
        }
    }
}
