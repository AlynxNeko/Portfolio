package com.dp.praktikum;

import java.util.Scanner;

public class PR {
    public static void main(String[] args) {
        //deklarasi
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        int count;

        //loop buat tiap angka
        for (int i=1;i<=input;i++){
            count = 0;
            //loop buat cek faktor
            for (int j=1;j<=i;j++)
                if (i%j==0)
                    count++;
            System.out.print(count);
            //if buat koma supaya nda kelebihan
            if (i!=input)
                System.out.print(",");
        }
    }
}
