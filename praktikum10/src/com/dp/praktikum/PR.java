package com.dp.praktikum;

//Buatlah menu untuk membuat sebuah string menjadi lowercase,
//uppercase, sentence case, atau title case

import java.util.Scanner;

public class PR {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int pil;
        String text="";
        do {
            System.out.print("""
                Menu:
                1. Input Kalimat
                2. Upper Case
                3. Lower Case
                4. Sentence Case
                5. Title Case
                6. Exit
                Pilihan:""");
            System.out.print(" ");
            pil = scn.nextInt();
            if (pil == 1) {
                System.out.print("Masukkan kalimat: ");
                scn.nextLine();
                text = scn.nextLine();
                continue;
            }

            if (text.length()==0)
                continue;

            if (pil == 2)
                System.out.println(text.toUpperCase());

            if (pil == 3)
                System.out.println(text.toLowerCase());

            if (pil == 4) {
                System.out.println(text.toUpperCase().charAt(0) +
                        text.substring(1).toLowerCase() + "");
            }
            if (pil == 5) {
                String[] cut = text.split(" ");
                for (String el:cut)
                    System.out.print(el.toUpperCase().charAt(0) +
                            el.substring(1).toLowerCase() + " ");
                System.out.println();
            }

        } while (pil!=6);
    }
}
