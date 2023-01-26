package com.dp.praktikum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        try {
            System.out.print("Masukkan deret angka: ");
            String deret = scn.nextLine();
            System.out.print("Masukkan index 1: ");
            int dex1 = scn.nextInt();
            System.out.print("Masukkan index 2: ");
            int dex2 = scn.nextInt();
            int[] deretAngka = toArray(deret);
            mbagi(dex1,dex2,deretAngka);
        }catch (ArithmeticException | IndexOutOfBoundsException | NumberFormatException e) {
            printErr(e.getMessage());
        }catch (InputMismatchException e) {
            System.out.println("Input salah!");
        }

        System.out.println("Selamat Jalan");
    }

    private static void mbagi(int index1, int index2, int[] deret) throws IndexOutOfBoundsException, ArithmeticException {
        if (index1 >= deret.length || index2 >= deret.length)
            throw new IndexOutOfBoundsException("Index terlalu besar!");
        else if (index1 < 0 || index2 < 0)
            throw new IndexOutOfBoundsException("Index terlalu kecil!");
        else if (deret[index2]==0)
            throw new ArithmeticException("Pembagian dengan nol!");
        int a = deret[index1];
        int b = deret[index2];
        System.out.println(a + " / " + b + " = " + a/b);
        if (a%b > 0)
            System.out.println("Sisa = " + a%b);
    }

    public static void printErr(String message) {
        System.out.println("Terjadi kesalahan -> " + message);
    }

    public static int[] toArray(String deret) throws NumberFormatException {
        String[] s = deret.split(",");
        int[] arr = new int[s.length];
        try {
            for (int i = 0; i < s.length; i++) {
                arr[i] = Integer.parseInt(s[i].trim());
            }
        }catch (NumberFormatException e) {
            throw new NumberFormatException("Input bukan angka!");
        }
        return arr;
    }
}
