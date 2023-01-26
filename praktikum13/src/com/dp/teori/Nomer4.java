package com.dp.teori;

import java.util.ArrayList;
import java.util.Scanner;

public class Nomer4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<ArrayList<Character>> alpha = new ArrayList<>();
        System.out.print("Input: ");
        String input = scn.nextLine().toLowerCase();

        for (int i = 0; i < 26; i++) {
            alpha.add(new ArrayList<>());
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c>122 || c<97)
                continue;
            alpha.get(c - 97).add(c);
        }
        int max = 0;
        for (int i = 0; i < alpha.size(); i++) {
            if (max < alpha.get(i).size())
                max = alpha.get(i).size();
        }
        System.out.println("Karakter yang paling banyak muncul adalah: ");
        for (int i = 0; i < alpha.size(); i++) {
            if (alpha.get(i).size()==max)
                System.out.print(alpha.get(i).get(0) + " ");
        }
        System.out.printf("sebanyak %d kali",max);
    }
}
