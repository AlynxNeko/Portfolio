package com.dp.praktikum5;

import java.util.Scanner;

public class WhileDoWhile {
    public static void main(String[] args) {
        int jumlahBaris;
        boolean inputSalah = true;

        do {//input sampe benar
            Scanner scn = new Scanner(System.in);
            System.out.println("Masukkan angka antara 1-5");
            jumlahBaris=scn.nextInt();
            //jika input salah ulangi
            if (jumlahBaris>0 && jumlahBaris<6)
                inputSalah=false;
            if (inputSalah)
                System.out.println("antara 1 sampe 5 woi, cuma ada 1 2 3 4 5");
        } while (inputSalah); //selama input masih salah do loop

        while (jumlahBaris>0){
            System.out.println("*");
            jumlahBaris--;
        }
    }
}
