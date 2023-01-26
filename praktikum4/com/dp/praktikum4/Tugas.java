package com.dp.praktikum4;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double angka1, angka2;
        boolean isSquare = false;
        boolean isFrame = false;

        //input
        System.out.println("input x y: ");
        angka1 = scn.nextDouble();
        angka2 = scn.nextDouble();


        //bujur sangkar or not
        if (angka1 == angka2)
            isSquare = true;

        else if (angka1 < angka2) {
            if (angka1 / angka2 == 0.75)
                isFrame = true;
        }
        else if (angka2 / angka1 == 0.75)
            isFrame = true;


        if (isSquare)
            System.out.println("Bujursangkar");
        else if (isFrame)
            System.out.println("Photo Frame");
        else
            System.out.println("Persegi Panjang Normal");

    }
}
