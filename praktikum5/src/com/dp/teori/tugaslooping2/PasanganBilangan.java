package com.dp.teori.tugaslooping2;

import java.util.Scanner;

public class PasanganBilangan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        for (int i=1;i<=num/2;i++)
            System.out.println(i + " " + (num-i));
    }
}
