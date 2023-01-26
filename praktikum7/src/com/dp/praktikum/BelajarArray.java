package com.dp.praktikum;

import java.util.Scanner;

public class BelajarArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan jumlah: ");
        int n = scn.nextInt();
        scn.nextLine();
        String[] array = new String[n];

        System.out.println("Masukkan isi array:");
        for (int i=0;i<array.length;i++){
            array[i]=scn.next();
        }
        System.out.println();
        System.out.print("{");
        for (int i=0;i<array.length;i++) {
            System.out.print("\""+array[i]+"\"");
            if (i!= array.length-1)
                System.out.print(",");
        }
        System.out.print("};");
    }
}
