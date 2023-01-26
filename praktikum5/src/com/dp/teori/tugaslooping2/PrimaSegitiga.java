package com.dp.teori.tugaslooping2;

import java.util.Scanner;

public class PrimaSegitiga {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int jumP,angka=0,count,baris=1,kolom=1;
        jumP = scn.nextInt();
        for (int j=0;j<jumP;) {
            count=0;
            for (int i = 1; i <= angka; i++)
                if (angka % i == 0)
                    count++;
            if (count == 2){
                System.out.print(angka + " ");
                j++;
                kolom++;
                if (kolom>baris){
                    System.out.println();
                    kolom=0;
                    baris++;
                }
            }
            angka++;
        }
    }
}
