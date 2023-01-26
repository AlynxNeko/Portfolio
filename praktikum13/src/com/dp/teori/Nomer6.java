package com.dp.teori;

import java.util.ArrayList;
import java.util.Scanner;

public class Nomer6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            char pil='0';
            do {
                System.out.print("Input sebuah kata: ");
                String input = scn.nextLine();
                if (i==0) {
                    if (!list1.contains(input))
                        list1.add(input);
                }
                else {
                    if (!list2.contains(input))
                        list2.add(input);
                }
                do {
                    System.out.print("Input lagi? ");
                    pil = scn.nextLine().toLowerCase().charAt(0);
                } while (pil !='n' && pil!= 'y');
            } while (pil!='n');

            if (i==0)
                System.out.println("Himpunan 1 = " + list1);
            else
                System.out.println("Himpunan 2 = " + list2);
        }

        ArrayList<String> temp = new ArrayList<>();
        for (String s1 : list1) {
            for (String s2 : list2) {
                if (s1.equals(s2))
                    temp.add(s1);
            }
        }
        System.out.println("Irisan: " + temp);

        ArrayList<String> temp2 = new ArrayList<>();
        for (String s : list1) {
            if (!temp2.contains(s))
                temp2.add(s);
        }
        for (String s : list2) {
            if (!temp2.contains(s))
                temp2.add(s);
        }
        System.out.println("Union = " + temp2);

        ArrayList <String> temp3 = new ArrayList<>();
        for (String s1 : temp2) {
            boolean isPrint = true;
            for (String s2 : temp) {
                if (s1.equals(s2)) {
                    isPrint = false;
                    break;
                }
            }
            if (isPrint)
                temp3.add(s1);
        }
        System.out.println("Beda setangkup: " + temp3);
    }
}
