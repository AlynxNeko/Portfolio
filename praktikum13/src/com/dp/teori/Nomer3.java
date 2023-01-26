package com.dp.teori;

import java.util.Locale;
import java.util.Scanner;

/*
Buat method yang mengecek apakah sebuah string palindrome atau tidak
mengabaikan huruf besar dan kecil. Disebut palindrome jika dibaca dari depan dan belakang sama.
Contoh:
Input: <Kasur rusak>
Output: palindrome
Input: <Universitas Kristen Petra>
Output: bukan palindrome
 */
public class Nomer3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean isPalin = true;
        System.out.print("Input: ");
        String input = scn.nextLine();
        String[] temp = input.split(" ");
        String noSpace = "";
        for (String s : temp) {
            noSpace = noSpace.concat(s).toLowerCase();
        }
        int n = noSpace.length();
        for (int i = 1; i < n/2; i++) {
            if (noSpace.charAt(i) != noSpace.charAt(n - i - 1)) {
                isPalin = false;
                break;
            }
        }
        if (isPalin)
            System.out.println("Palindrome");
        else System.out.println("Bukan Palindrome");
    }
}
