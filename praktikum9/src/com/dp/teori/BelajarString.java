package com.dp.teori;

import java.util.Scanner;

public class BelajarString {
    public static void main(String[] args) {
        //String is immutable
        /*String kata = "abcde";
        String kata2 = new String(kata);
        String kata3 = "abcde";
        System.out.println(kata.trim());
        System.out.println(kata);

        System.out.println("kata = kata2 -> " + (kata==kata2));
        System.out.println("kata = kata3 -> " + (kata==kata3));
        //pke == buat cek memory sama
        //kalo mau compare apakah huruf per hurufnya sama pake .equals
        */

        /*String awok = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(awok.substring(2,14));
        System.out.println(awok.substring(17));
        System.out.println(awok.substring(0,5));
        System.out.println("theres a \"m\": " + (-1!=awok.indexOf('m')));

         */
        Scanner scn= new Scanner(System.in);
        String kalimat = scn.nextLine();
        System.out.println(kalimat);
        int awal = kalimat.indexOf(" ");
        int akhir = kalimat.indexOf(" ",awal+1);
        System.out.println(kalimat.substring(awal+1,akhir));
        System.out.println(kalimat.replace('a','i').replace('u','i').replace('o','i').replace('e','i'));
    }
}
