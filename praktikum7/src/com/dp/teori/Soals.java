package com.dp.teori;

import java.util.Scanner;

public class Soals {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int bar = scn.nextInt();
        int kol = scn.nextInt();
        int[][] prime = new int[bar][kol];
        int bil = 2;
        int countPrime;

        for (int i=0;i<bar;i++) {
            for (int j = 0; j < kol;){
                //angka ditambah terus
                    //nyari prima e
                    countPrime = 0;
                    for (int n=1;n<bil;n++)
                        if (bil%n==0)
                            ++countPrime;
                    if (countPrime==1){
                        prime[i][j]=bil;
                        j++;
                    }
                    bil++;
            }
        }
        for (int i=0;i<bar;i++) {
            for (int j = 0; j < kol; j++)
                System.out.print(prime[i][j] + " ");
            System.out.println();
        }
    }
}
