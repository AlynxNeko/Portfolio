package com.dp.praktikum4;

import java.util.Scanner;

public class Teori4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Masukkan tanggal: ");
        int date = scn.nextInt();
        System.out.println("Masukkan bulan: ");
        int month = scn.nextInt();
        System.out.println("Masukkan Tahun: ");
        int year = scn.nextInt();
        int jumlahHari;

        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                jumlahHari = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                jumlahHari = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    jumlahHari = 29;
                else
                    jumlahHari = 28;
                break;
            default:
                jumlahHari = 0;
            }

            System.out.print(date+"-"+month+"-"+year);

            if (date<=jumlahHari && date>0)
                System.out.println(" is valid");
            else System.out.println(" is not valid");
        }

}
