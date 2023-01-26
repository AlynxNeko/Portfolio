package com.dp.praktikum;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input kalimat: ");
        String text = scn.nextLine();
        System.out.print("Yang mau dipotong: ");
        String cut = scn.nextLine();
        int count=0;

        while (text.contains(cut)) {
            text = text.substring(0,text.indexOf(cut)) +
                    text.substring(text.indexOf(cut)+cut.length());
            count++;
        }
        System.out.printf("Kata %s dihapus %dx, string menjadi:\n",cut,count);
        System.out.println(text);
    }
}
