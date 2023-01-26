package com.dp.praktikum5;
//Buatlah program yang menerima input berupa angka dari 1 sampai 10. Jika angka yang dimasukkan bukan 1 sampai 10 maka program harus meminta input lagi sampai user menginput dengan benar.
//
//Berdasarkan angka yang dimasukkan cetaklah output "*" dengan jumlah sesuai output yang dimasukkan dengan formasi seperti contoh dibawah:
//
//Contoh:
//Input: 5
//Output:
//*
//**
//***
//****
//*****
//
//Contoh 2:
//Input: 3
//Output:
//*
//**
//***

//Timothy Gilbert H
//c14220108
import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        int jumlahBaris;
        boolean inputSalah = true;

        do {//input sampe benar
            Scanner scn = new Scanner(System.in);
            System.out.println("Masukkan angka antara 1-10");
            jumlahBaris=scn.nextInt();
            //jika input salah ulangi
            if (jumlahBaris>=1 && jumlahBaris<=10)
                inputSalah=false;
            if (inputSalah)
                System.out.println("Angka tersebut bukan angka antara 1-10");
        } while (inputSalah); //selama input masih salah do loop

        for (int i=0;i<jumlahBaris;i++){
            for (int j=jumlahBaris;j>i;j--)
                System.out.print("*");
            System.out.println();
        }
    }
}

