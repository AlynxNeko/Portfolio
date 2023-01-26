package com.dp.praktikum;

import java.util.Scanner;

public class ThrowException {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan angka 1: ");
        int n = scn.nextInt();
        scn.nextLine();
        System.out.print("Masukkan angka 2: ");
        int m = scn.nextInt();
        scn.nextLine();
        try {
            double x = bagi(n,m);
            System.out.println("Hasil = " + x);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e);
            printError(e.getMessage());
        }
        System.out.println("untung di catch, jadi masih jalan programnya");
    }

    public static void printError(String message) {
        System.out.println("Sum Ting Wong -> " + message);
    }

    private static int bagi(int n, int m) throws ArithmeticException{
        if (m == 0)
            throw new ArithmeticException("Pembagian dengan 0");
        return n/m;
    }
}
